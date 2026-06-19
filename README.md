# Weather App ☀️🌧️

A modern Android Weather application built with **Clean Architecture**, **Jetpack Compose**, **MVVM**, **Hilt**, **Retrofit**, **Room**, and **Coroutines**.

## Repository

🔗 Repository: https://github.com/JAVADESTEKI/WeatherApp-Jetpack_Compose_Clean_Architecture

---

## Screenshots

![Shot](https://raw.githubusercontent.com/JAVADESTEKI/Weather-clean-architecture--convert-to-Compose/main/ScreenShot/Shot.png)

---

## Features

* Search cities
* Display current weather
* Display weather forecast
* Save cities locally
* Offline persistence using Room
* Last selected city persistence using DataStore
* Modern UI with Jetpack Compose
* Clean Architecture
* Dependency Injection with Hilt
* Kotlin Coroutines & Flow

---

## Tech Stack

### Presentation Layer

* Jetpack Compose
* ViewModel
* StateFlow
* Material 3

### Domain Layer

* Use Cases
* Repository Contracts
* Business Logic

### Data Layer

* Retrofit
* Room Database
* DataStore
* Repository Implementations
* DTO ↔ Domain Mappers

### Dependency Injection

* Hilt

### Testing

* JUnit
* MockK
* Integration Tests
* DAO Tests

## API

This project uses the OpenWeather API:

https://openweathermap.org/api

Features powered by the API include:

- Current weather conditions
- 5-day weather forecast
- City search and geolocation
---

## Architecture

The project follows **Clean Architecture** principles:

```text
Presentation
      │
      ▼
   Domain
      │
      ▼
    Data
```

### Project Structure

```text
weather
│
├── data
│   ├── local
│   │   ├── dao
│   │   │   └── CityDao.kt
│   │   │
│   │   ├── database
│   │   │   └── WeatherDatabase.kt
│   │   │
│   │   ├── entity
│   │   │   ├── CityEntity.kt
│   │   │   ├── ForecastEntity.kt
│   │   │   └── WeatherEntity.kt
│   │   │
│   │   └── relation
│   │       └── CityFullData.kt
│   │
│   ├── remote
│   │   ├── api
│   │   │   ├── ApiClient.kt
│   │   │   └── ApiServices.kt
│   │   │
│   │   ├── mapper
│   │   │   ├── CityMapper.kt
│   │   │   ├── ForecastMapper.kt
│   │   │   └── WeatherMapper.kt
│   │   │
│   │   └── response
│   │       ├── CityResponse.kt
│   │       ├── CurrentWeatherResponse.kt
│   │       └── ForecastResponse.kt
│   │
│   ├── mapper
│   │   ├── CityEntityMapper.kt
│   │   ├── CityFullDataMapper.kt
│   │   ├── ForecastEntityMapper.kt
│   │   └── WeatherEntityMapper.kt
│   │
│   ├── preference
│   │   └── UserPreferenceDataStore.kt
│   │
│   └── repository
│       ├── WeatherRepositoryImpl.kt
│       └── UserPreferenceRepositoryImpl.kt
│
├── domain
│   ├── model
│   │   ├── Weather.kt
│   │   ├── Forecast.kt
│   │   ├── City.kt
│   │   └── CityWeatherForecast.kt
│   │
│   ├── repository
│   │   ├── WeatherRepository.kt
│   │   └── UserPreferenceRepository.kt
│   │
│   └── usecase
│       ├── GetCurrentWeatherUseCase.kt
│       ├── GetForecastUseCase.kt
│       ├── SearchCitiesUseCase.kt
│       ├── SaveCityFullDataUseCase.kt
│       ├── UpdateCityFullDataUseCase.kt
│       ├── DeleteCityUseCase.kt
│       ├── GetSavedCitiesUseCase.kt
│       ├── GetLastSelectedCityUseCase.kt
│       ├── GetLastSelectedCityIdUseCase.kt
│       ├── SaveLastSelectedCityIdUseCase.kt
│       ├── GetLastSelectedCityFullDataUseCase.kt
│       └── GetLastInsertedIdUseCase.kt
│
├── presentation
│   ├── activity
│   │   └── MainActivity.kt
│   │
│   ├── screen
│   │   ├── MainScreen.kt
│   │   └── CitySearchScreen.kt
│   │
│   ├── viewmodel
│   │   ├── WeatherViewModel.kt
│   │   ├── WeatherUiState.kt
│   │   ├── CitySearchViewModel.kt
│   │   └── CitySearchUiState.kt
│   │
│   └── utils
│       └── WeatherIconMapper.kt
│
└── di
    ├── App.kt
    ├── AppModule.kt
    ├── DispatchersModule.kt
    ├── DispatchersQualifiers.kt
    └── PreferenceModule.kt
```

---

## Build & Run

```bash
git clone https://github.com/JAVADESTEKI/WeatherApp-Jetpack_Compose_Clean_Architecture.git
```

Open the project in Android Studio and run:

```bash
Sync Gradle
Build Project
Run App
```

---

## Author

**Mohammad Javad Esteki**
