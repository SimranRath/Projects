import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
import seaborn as sns
import plotly.express as px
from wordcloud import WordCloud, STOPWORDS

# Load the data
data = pd.read_csv("./instagram data.csv", encoding='latin1')
print(data.head())

# Drop missing values
data = data.dropna()

# Display data info
data.info()

# Plotting distributions
plt.figure(figsize=(10, 8))
plt.style.use('fivethirtyeight')
plt.title("Distribution of Impressions From Home")
sns.histplot(data['From Home'], kde=True)
plt.show()

plt.figure(figsize=(10, 8))
plt.title("Distribution of Impressions From Hashtags")
sns.histplot(data['From Hashtags'], kde=True)
plt.show()

plt.figure(figsize=(10, 8))
plt.title("Distribution of Impressions From Explore")
sns.histplot(data['From Explore'], kde=True)
plt.show()

# Generate word clouds
text = " ".join(i for i in data.Caption)
stopwords = set(STOPWORDS)
wordcloud = WordCloud(stopwords=stopwords, background_color="white").generate(text)

plt.style.use('classic')
plt.figure(figsize=(12, 10))
plt.imshow(wordcloud, interpolation='bilinear')
plt.axis("off")
plt.show()

text = " ".join(i for i in data.Hashtags)
wordcloud = WordCloud(stopwords=stopwords, background_color="white").generate(text)

plt.figure(figsize=(12, 10))
plt.imshow(wordcloud, interpolation='bilinear')
plt.axis("off")
plt.show()

# Scatter plot with trendline
figure = px.scatter(data_frame=data, x="Impressions", y="Likes", size="Likes", trendline="ols", title="Relationship Between Likes and Impressions")
figure.show()

# Calculate correlation matrix and display correlations with Impressions
correlation = data.select_dtypes(include=['number']).corr()
print(correlation["Impressions"].sort_values(ascending=False))

# Calculate and print conversion rate
conversion_rate = (data["Follows"].sum() / data["Profile Visits"].sum()) * 100
print(f"Conversion rate: {conversion_rate:.2f}%")

# Scatter plot with trendline
figure = px.scatter(data_frame=data, x="Profile Visits", y="Follows", size="Follows", trendline="ols", title="Relationship Between Profile Visits and Followers Gained")
figure.show()
