# Screen Color Sync
"Screen Color Sync" is an innovative software application that enables you to synchronize the colors of your NeoPixel LED strip with the colors of your computer screen in real-time. It achieves this by capturing the colors of your computer screen and sending them in hexadecimal format to a connected NodeMCU microcontroller, which then processes the data and outputs the corresponding color values to the NeoPixel LED strip.

With "Screen Color Sync", you can customize the number of LED pixels on the strip, the frequency of color updates, and even the range of colors displayed on the LED strip. Whether you're looking to create a unique ambiance in your living room, office, or workspace, this app provides a fun and exciting way to showcase your creativity and technical skills.

In addition to its intuitive user interface and easy-to-use features, "Screen Color Sync" is also compatible with a wide range of operating systems and hardware configurations, making it accessible to users with varying levels of technical expertise.

Overall, "Screen Color Sync" is a versatile and powerful tool that allows you to bring your creative ideas to life and transform your space into a colorful and vibrant environment.


## Features

* Captures screen colors in real-time.
* Sends color data to an Arduino board connected to NeoPixel LED strip.
* Visualizes the screen colors in real-time on the LED strip.
* Simple and user-friendly interface.

## Requirements

* Java Runtime Environment (JRE) version 8 or above.
* Arduino board compatible with Adafruit NeoPixel library.
* NeoPixel LED strip.
* USB cable to connect the Arduino board to the computer.


## Instructions to connect a NodeMCU board and a Neo Pixel LED strip, follow these steps:

1. Supply +5V to your NodeMCU board and Neo Pixel LED strip +5V pin.
2. Connect the ground pin of the NodeMCU board and the LED strip ground pin.
3. Supply 0V from the power supply.
4. Connect the LED strip DIN pin and NodeMCU board D2 pin through a 220ohms resistor.


## How to Use

1. Download and install the JDK version 8 or above.
2. Download and install the Arduino IDE.
3. Connect the NeoPixel LED strip to the Arduino board.
4. Upload the Arduino code to the board using the Arduino IDE. (screenCap1.ino )
5. Open the application.
6. Click on the open port button and screen track button to capture the screen colors and visualize them on the LED strip.
7. Click on the close port button to stop capturing the screen colors.

## Limitations

* The application captures the screen colors only from the primary screen.
* The LED strip connected to the Arduino board should be compatible with the Adafruit NeoPixel library.

## Images of hardware
<img src="docs/1.jpg" width="280"/>
<img src="docs/2.jpg" width="280"/>
<img src="docs/3.jpg" width="280"/>

### Image of the app
<img src="docs/4.jpg" width="280"/>

