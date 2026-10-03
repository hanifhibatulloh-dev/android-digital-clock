<p align="center">
  <img src="screenshots/clock-preview.jpeg" alt="Android Digital Clock Preview" width="900">
</p>

# Android Digital Clock

A minimalist fullscreen digital clock application for Android phones and tablets, built with **Kotlin** and **Jetpack Compose**.

The app is designed to turn an Android device into a simple and clean digital clock display for desks, rooms, bedside setups, or secondary displays.

---

## Features

- Real-time digital clock
- Current date display
- Fullscreen immersive mode
- Landscape orientation
- Keeps the screen awake while running
- Minimal and clean interface
- Digital-style typography
- Automatic time updates
- Suitable for smartphones and tablets

---

## Tech Stack

- Kotlin
- Android Studio
- Jetpack Compose
- Material 3
- Android SDK
- Gradle
- Kotlin Coroutines

---

## How It Works

The application displays the current time in:

```text
HH:mm
```

and updates it automatically while the application is running.

The app also displays the current date and uses Android fullscreen mode to provide a distraction-free clock interface.

To keep the clock visible, the application prevents the device screen from automatically turning off while the app is active.

---

## Use Cases

Android Digital Clock can be used as:

- Desk clock
- Tablet clock display
- Bedside clock
- Room clock
- Secondary display
- Clock for a docked Android device

---

## Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/hanifhibatulloh-dev/android-digital-clock.git
```

### 2. Open in Android Studio

Open **Android Studio** and select:

```text
Open
```

Then select the cloned project folder.

### 3. Sync Gradle

Wait until Android Studio completes the Gradle synchronization process.

### 4. Run the Application

Connect an Android device or start an emulator, then click:

```text
Run
```

The application will launch as a fullscreen digital clock.

---

## Project Structure

```text
android-digital-clock/
│
├── screenshots/
│   └── clock-preview.png
│
├── app/
│   └── src/
│       └── main/
│           ├── java/
│           │   └── com/example/clocktab/
│           │       ├── MainActivity.kt
│           │       └── ui/theme/
│           │
│           ├── res/
│           └── AndroidManifest.xml
│
├── gradle/
├── build.gradle.kts
├── gradle.properties
├── settings.gradle.kts
└── README.md
```

---

## Future Improvements

Possible improvements for future versions:

- 12-hour and 24-hour format options
- Custom clock colors
- Multiple clock themes
- Brightness control
- AMOLED mode
- Alarm feature
- Weather information
- Custom date formats
- Additional digital fonts
- Burn-in prevention

---

## Author

**Muhammad Hanif Hibatulloh**

Computer Science Student  
Universitas Jenderal Achmad Yani

[GitHub](https://github.com/hanifhibatulloh-dev)

[LinkedIn](https://www.linkedin.com/in/muhammad-hanif-hibatulloh)

---

## License

This project is licensed under the **MIT License**.
