# Kotlin Multiplatform (KMP) - Ktor & SQLDelight Demo

[![Kotlin](https://img.shields.io/badge/kotlin-1.9.0-blue.svg?logo=kotlin)](http://kotlinlang.org)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

A Kotlin Multiplatform project implementing networking with Ktor and local caching with SQLDelight, following the [JetBrains official tutorial](https://www.jetbrains.com/help/kotlin-multiplatform-dev/multiplatform-ktor-sqldelight.html).

## 🚀 Quick Start

### Prerequisites
- Android Studio (with Kotlin plugin)
- Xcode 15+ (for iOS build)
- Java 17+

### Installation
```
git clone https://github.com/kyawtmayhlaing173/SpaceTutorial.git
```

### Run the Apps
Android:

```./gradlew :androidApp:assembleDebug```

iOS:

```
Open iosApp/iosApp.xcodeproj in Xcode

Select your simulator/device

Click "Run"
```

### 💡 Key Features
- Shared KMM Core: Business logic written once
- Ktor Client: Multiplatform HTTP requests
- SQLDelight: Cross-platform SQLite database
- Dependency Injection: Koin (optional)

### 🔗 Resources
- [Official Kotlin Multiplatform Docs]("https://kotlinlang.org/docs/multiplatform.html")
- [Kotlin Multiplatform Development]("https://www.jetbrains.com/help/kotlin-multiplatform-dev/multiplatform-ktor-sqldelight.html")