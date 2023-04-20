#include <Adafruit_NeoPixel.h>

// Constants
const int NUM_PIXELS = 29;
const int NEOPIXEL_PIN = D2;

// NeoPixel object
Adafruit_NeoPixel strip(NUM_PIXELS, NEOPIXEL_PIN, NEO_GRB + NEO_KHZ800);

void setup() {
  Serial.begin(115200);
  strip.begin();
  strip.show(); // Initialize all pixels to off
}

void loop() {
  if (Serial.available() > 0) {
    char startChar = Serial.read();
    if (startChar == 'c') {
      String colorHex = Serial.readStringUntil('e');
      for (int i = 0; i < NUM_PIXELS; i++) {
        String pixelColorHex = colorHex.substring(i*6, i*6+6);
        uint32_t pixelColor = (uint32_t) strtol(pixelColorHex.c_str(), NULL, 16);
        strip.setPixelColor(i, pixelColor);
      }
      strip.show();
    }
  }
}
