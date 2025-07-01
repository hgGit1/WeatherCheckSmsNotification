WeatherCheckSmsNotification
This Spring Boot application is designed to send personalized messages based on the weather conditions at a specified location. The app behavior can be customized as needed by modifying the configuration or code. Key Features

Scheduled Weather Check: A scheduled task runs every 2 hours to fetch the current weather conditions of a location specified in the application.properties file.

Rain Detection & Song Suggestion: If rain is detected, the application selects a romantic or mood-matching song from YouTube based on the weather.

Automated SMS Delivery: It sends the song URL along with a thoughtful message to the recipient via SMS.

External APIs Used WeatherAPI.com: Used to fetch real-time weather information for the configured location.

Twilio.com: Used to send SMS messages to the recipient's mobile number.
