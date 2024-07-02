Live Match Score App
Introduction
The Live Match Score App is an Android application developed using Kotlin and Retrofit API. This app allows users to get real-time updates on match scores. It is designed to be user-friendly, providing live scores with a clean and intuitive interface.

Features
Live Match Updates: Fetch and display real-time scores.
Match Details: View detailed information about ongoing matches.
Upcoming Matches: Display a list of upcoming matches.
Team and Player Info: Provide detailed information about teams and players.
Technologies Used
Kotlin: The programming language used for Android development.
Retrofit: A type-safe HTTP client for Android and Java to handle API requests.
MVVM Architecture: To separate the concerns of the app and make it more manageable.
LiveData: To update the UI with live data changes.
ViewModel: To manage UI-related data in a lifecycle-conscious way.
RecyclerView: To display lists of data efficiently.
Getting Started
To get started with the Live Match Score App, follow these steps:

Screenshot

![WhatsApp Image 2024-07-02 at 9 35 35 PM](https://github.com/Yatra052/LiveCricketScoreApp/assets/108984857/0968586e-9520-49bd-aab2-a85fee2ddf1b)


![WhatsApp Image 2024-07-02 at 9 35 33 PM](https://github.com/Yatra052/LiveCricketScoreApp/assets/108984857/31d0138a-e06a-4b5b-ab9b-cecca74805d0)

Clone the Repository:

Copy code
git clone https://github.com/yourusername/livematchscoreapp.git
cd livematchscoreapp
Open in Android Studio:
Open the project in Android Studio to set up your development environment.

Dependencies:
Ensure all the required dependencies are added in the build.gradle file.

groovy
Copy code
implementation 'com.squareup.retrofit2:retrofit:2.9.0'
implementation 'com.squareup.retrofit2:converter-gson:2.9.0'
implementation "androidx.lifecycle:lifecycle-extensions:2.2.0"
implementation "androidx.recyclerview:recyclerview:1.2.0"
