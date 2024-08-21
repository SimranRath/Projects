#!/bin/bash

# Update package lists
sudo apt-get update -y 

# Install required packages
sudo apt-get install -y ca-certificates curl gnupg lsb-release || { echo "Failed to install required packages"; exit 1; }

# Add Docker's official GPG key
sudo mkdir -p /etc/apt/keyrings || { echo "Failed to create keyrings directory"; exit 1; }
curl -fsSL https://download.docker.com/linux/ubuntu/gpg | sudo gpg --dearmor -o /etc/apt/keyrings/docker.gpg || { echo "Failed to add Docker's GPG key"; exit 1; }

# Add Docker's official APT repository
echo \
  "deb [arch=$(dpkg --print-architecture) signed-by=/etc/apt/keyrings/docker.gpg] https://download.docker.com/linux/ubuntu \
  $(lsb_release -cs) stable" | sudo tee /etc/apt/sources.list.d/docker.list > /dev/null || { echo "Failed to add Docker's APT repository"; exit 1; }

# Update package lists again
sudo apt-get update -y || { echo "Failed to update package lists"; exit 1; }

# Install Docker packages
sudo apt-get install -y docker-ce docker-ce-cli containerd.io docker-buildx-plugin docker-compose-plugin || { echo "Failed to install Docker packages"; exit 1; }

sudo docker run -d -p 8000:8000 malaya07/todo:01