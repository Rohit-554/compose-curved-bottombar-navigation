# Compose Curved Bottom Navigation

[![Kotlin](https://img.shields.io/badge/Kotlin-2.2.20-blue.svg?style=flat-square)](http://kotlinlang.org)
[![Compose Multiplatform](https://img.shields.io/badge/Compose-Multiplatform-brightgreen.svg?style=flat-square)](https://www.jetbrains.com/lp/compose-multiplatform/)
[![License](https://img.shields.io/badge/License-MIT-yellow.svg?style=flat-square)](https://opensource.org/licenses/MIT)

A highly customizable Curved Bottom Navigation bar for Jetpack Compose, built with Kotlin Multiplatform to support both Android and iOS.

# Preview
https://github.com/user-attachments/assets/2c3ca053-d97b-4195-8c4d-d97ad9871235




## ✨ Features

- **Highly Customizable**: Almost every aspect of the navigation bar can be customized, from colors and sizes to animation styles.
- **Kotlin Multiplatform**: A single codebase for both Android and iOS.
- **Built with Compose**: Leverages the power and flexibility of Jetpack Compose.
- **Three Curve Animation Styles**: Choose from `SMOOTH`, `DYNAMIC`, or `BOUNCY` animations.
- **Easy to Use**: Simple integration with just a few lines of code.

## Installation

This project is not yet available as a library. This feature is **coming soon**!

In the meantime, you can use it by following these steps:
1. Fork this repository.
2. Copy the `animatedBottomBar` package (`composeApp/src/commonMain/kotlin/io/jadu/animatedBottomBar`) into your own project's multiplatform module.
3. That's it! You can now use the `CurvedBottomNavigation` composable and start customizing it.


## Usage

First, define your navigation items. Each `NavItem` represents a screen or destination in your app.

```kotlin
val navItems = listOf(
    NavItem(
        label = "Home",
        icon = Icons.Outlined.Home,
        selectedIcon = Icons.Filled.Home
    ),
    NavItem(
        label = "Search",
        icon = Icons.Outlined.Search,
        selectedIcon = Icons.Filled.Search
    ),
    // ... more items
)
```

Then, add the `CurvedBottomNavigation` composable to your UI. It works well within a `Scaffold`:

```kotlin
var selectedIndex by remember { mutableStateOf(0) }

Scaffold(
    bottomBar = {
        CurvedBottomNavigation(
            items = navItems,
            selectedIndex = selectedIndex,
            onItemSelected = { index ->
                selectedIndex = index
            }
        )
    }
) {
    // Your main screen content, which can change based on selectedIndex
    SampleScreens(currentIndex = selectedIndex)
}
```

## Customization

You can customize almost every part of the navigation bar. Here are the available options:

| Parameter              | Type                 | Description                                                  |
| ---------------------- | -------------------- | ------------------------------------------------------------ |
| `items`                | `List<NavItem>`      | The list of navigation items to display.                     |
| `selectedIndex`        | `Int`                | The index of the currently selected item.                    |
| `modifier`             | `Modifier`           | A `Modifier` for the component.                              |
| `bottomBarAlignment`   | `Alignment`          | Alignment of the bottom bar in its parent.                   |
| `curveAnimationType`   | `CurveAnimationType` | Animation style for the curve (`SMOOTH`, `DYNAMIC`, `BOUNCY`). |
| `animationDuration`    | `Int`                | Duration for the animations in milliseconds.                 |
| `fabBackgroundColor`   | `Color`              | Background color of the floating action button (FAB).        |
| `fabIconTint`          | `Color`              | Tint color for the selected icon on the FAB.                 |
| `fabDotColor`          | `Color`              | Color of the indicator dot below the FAB icon.               |
| `navBarBackgroundColor`| `Color`              | Background color of the navigation bar itself.               |
| `unselectedIconTint`   | `Color`              | Tint color for the unselected icons.                         |
| `unselectedTextColor`  | `Color`              | Color for the unselected item labels.                        |
| `fabSize`              | `Dp`                 | The size (diameter) of the FAB.                              |
| `fabIconSize`          | `Dp`                 | The size of the icon inside the FAB.                         |
| `fabDotSize`           | `Dp`                 | The size of the dot indicator.                               |
| `enableFabIconScale`   | `Boolean`            | If `true`, the FAB icon will have a scaling animation.       |
| `navBarHeight`         | `Dp`                 | The height of the navigation bar.                            |
| `unselectedIconSize`   | `Dp`                 | The size of the unselected icons.                            |
| `unselectedTextSize`   | `TextUnit`           | Font size for the unselected item labels.                    |
| `fabElevation`         | `Dp`                 | Elevation (shadow) of the FAB.                               |
| `curveRadius`          | `Dp`                 | The radius of the curve on the top edge.                     |
| `curveDepth`           | `Dp`                 | How deep the curve cuts into the bar.                        |
| `curveSmoothness`      | `Dp`                 | Controls the smoothness of the curve's edges.                |
| `showDot`              | `Boolean`            | Whether to show the small dot indicator.                     |
| `showLabels`           | `Boolean`            | Whether to show text labels for unselected items.            |
| `enableHapticFeedback` | `Boolean`            | If `true`, the device will vibrate on item selection.        |
| `onItemSelected`       | `(Int) -> Unit`      | A callback that is invoked when an item is selected.         |

### Curve Animation Types

- `SMOOTH`: A simple, elegant animation using `FastOutSlowInEasing`.
- `DYNAMIC`: A more playful animation using a medium-bouncy spring.
- `BOUNCY`: A very energetic animation with a high-bouncy spring.

## Contributing

Contributions are what make the open-source community such an amazing place to learn, inspire, and create. Any contributions you make are **greatly appreciated**.

If you have a suggestion that would make this better, please fork the repo and create a pull request. You can also simply open an issue with the tag "enhancement".

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## Feature Requests

Have an idea for a new feature? Open an issue to discuss it. We're always looking to improve the library.

##  License

**MIT License**

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.

---

<p align="center">Built with love ❤️ by <b>Jadu</b></p>
