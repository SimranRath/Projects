provider "aws" {
  region = "ap-northeast-2"
}

resource "aws_instance" "app" {
  ami           = "ami-05d2438ca66594916"
  instance_type = "t2.micro"
  key_name = "mk3"
  tags = {
    Name = "backend-server"
  }
   # Define a security group allowing SSH access
  vpc_security_group_ids = [aws_security_group.docker_sg.id]

  # Provisioner to install Docker
 provisioner "file" {
    source      = "./front.sh"
    destination = "/home/ubuntu/front.sh"
    connection {
      type        = "ssh"
      user        = "ubuntu"
      private_key = file("./mk3.pem")
      host        = self.public_ip
    }
  }

  provisioner "remote-exec" {
    connection {
      type        = "ssh"
      user        = "ubuntu"
      private_key = file("./mk3.pem")
      host        = self.public_ip
    }

    inline = [
      "chmod +x /home/ubuntu/front.sh",
      "./front.sh"
    ]
  }


}

resource "aws_security_group" "docker_sg" {
  name        = "docker-sg"
  description = "Allow SSH and HTTP"

  ingress {
    from_port   = 22
    to_port     = 22
    protocol    = "tcp"
    cidr_blocks = ["0.0.0.0/0"]
  }

  ingress {
    from_port   = 80
    to_port     = 80
    protocol    = "tcp"
    cidr_blocks = ["0.0.0.0/0"]
  }

  ingress {
    from_port   = 443
    to_port     = 443
    protocol    = "tcp"
    cidr_blocks = ["0.0.0.0/0"]
  }

  egress {
    from_port   = 0
    to_port     = 0
    protocol    = "-1"
    cidr_blocks = ["0.0.0.0/0"]
  }
}

