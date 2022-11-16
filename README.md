# CocktailApp [ Under Construction 🛠️ ]

An android app built using Jetpack Compose that consumes CocktailDB API to display cocktail image, description, ingredients, and procedure to prepare the cocktail. The app also has functionality of adding ingredients to a shopping list.

[Figma Design](https://www.figma.com/file/yAMJUuyEIFU7bY6KKgIOe5/CocktailApp2?node-id=113%3A275&t=9LIUGYMYrwmxwGTG-1)
Home | Reels | Shop
--- | --- | ---
<img src="instaUI/home.jpg" width="280"/> | <img src="instaUI/reels2.jpg" width="280"/> | <img src="instaUI/shop.jpg" width="280"/>

Search | Search | Profile
--- | --- | ---
<img src="instaUI/search.jpg" width="280"/> | <img src="instaUI/search2.jpg" width="280"/> | <img src="instaUI/profile.jpg" width="280"/>

# Tech Stack

- [Kotlin](https://kotlinlang.org/) - A cross-platform, statically typed, general-purpose programming language with type inference and run on JVM.

- [Jetpack Components](https://developer.android.com/jetpack)
    - [Jetpack Compose](https://developer.android.com/jetpack/compose)- Android's recommended modern toolkit for building native UI.
    - [Android KTX](https://developer.android.com/kotlin/ktx.html) - Connects Kotlin concisely to Jetpack, Android, and other APIs..
    - [AndroidX](https://developer.android.com/jetpack/androidx) - Major improvement to the original Android [Support Library](https://developer.android.com/topic/libraries/support-library/index), which is no longer maintained.
    - [Lifecycle](https://developer.android.com/topic/libraries/architecture/lifecycle) - Perform actions in response to a change in the lifecycle status of another component, such as activities and fragments.
    - [Room](https://developer.android.com/training/data-storage/room) - Provides an abstraction layer over SQLite used for offline data caching.
    - [Preferences Datastore](https://developer.android.com/topic/libraries/architecture/datastore) - Jetpack DataStore is a data storage solution that allows you to store key-value pairs or typed objects with protocol buffers. DataStore uses Kotlin coroutines and Flow to store data asynchronously, consistently, and transactionally.
    - [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel) - Designed to store and manage UI-related data in a lifecycle conscious way. The ViewModel class allows data to survive configuration changes such as screen rotations.


- [MVVM Architecture](https://developer.android.com/topic/architecture) - A software architecture that removes the tight coupling between components. Most importantly, in this architecture, the children don't have the direct reference to the parent, they only have the reference by observables.
- [Hilt](https://dagger.dev/hilt/) - Hilt provides a standard way to incorporate Dagger dependency injection into an Android application.
- [Accompanist Pager Layout](https://google.github.io/accompanist/) -A library which provides paging layouts for Jetpack Compose. If you've used Android's ViewPager before, it has similar properties.
- [Accompanist HorizontalPager](https://google.github.io/accompanist/pager/) - is a layout which lays out items in a horizontal row, and allows the user to horizontally swipe between pages.
- [Accompanist - System UI Controller](https://github.com/google/accompanist/blob/main/systemuicontroller) - A library that provides easy-to-use utilities for recoloring the Android system bars from Jetpack Compose.
- [CoilImage Loader](https://coil-kt.github.io/coil/getting_started/) - Coil is a Jetpack Compose image loading library which fetches and displays network images.
- [Retrofit](https://square.github.io/retrofit/) - Type-safe http client
  and supports coroutines out of the box.
- [GSON](https://github.com/square/gson) - JSON Parser,used to parse
  requests on the data layer for Entities and understands Kotlin non-nullable
  and default parameters.
- [OkHttp Logging Interceptor](https://github.com/square/okhttp/blob/master/okhttp-logging-interceptor/README.md) - Logs HTTP request and response data.
- [Coroutines](https://github.com/Kotlin/kotlinx.coroutines) - Library Support for coroutines.
- [Flows](https://developer.android.com/kotlin/flow) - Flows are built on top of coroutines and can provide multiple values. A flow is conceptually a stream of data that can be computed asynchronously.


## Architecture
The architecture used is MVVM Architecture;

Layer | Components
--- | ---
*1. Presentation Layer* | ✔ View ✔ ViewModels ✔ Relevant Mappers ✔ Relevant Models.
*2. Domain Layer* | ✔ The repository ✔ The relevant domain models.
*3. Data Layer* | ✔ Storing and fetching Preferences ✔ The repository implementation ✔ The relevant data models ✔ Relevant Mappers
