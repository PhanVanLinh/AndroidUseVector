# AndroidUseVector

### Enable use vector
```
android {
  ...
  defaultConfig {
    ...
    vectorDrawables.useSupportLibrary = true
  }
}
```
### Some note
#### 1) Vector not working in selector
https://stackoverflow.com/questions/36741036/android-selector-drawable-with-vectordrawables-srccompat
https://stackoverflow.com/questions/35800334/how-to-use-vector-drawables-with-view-besides-imageview-with-srccompat/36762775#36762775


#### 2) AppCompatResources.getDrawable(...) vs ResourcesCompat.getDrawable(...)
AppCompatResources support vector
ResourcesCompat don't support get vector