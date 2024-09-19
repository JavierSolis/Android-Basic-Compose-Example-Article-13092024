# Courses Android Compose Basic - Solution Code #AndroidBasics

---

Solution code for the Android Basics with Compose

Exercise source: https://developer.android.com/codelabs/basic-android-kotlin-compose-composables-practice-problems?hl=es-419&continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-1-pathway-3%3Fhl%3Des-419%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-composables-practice-problems#1

# Description

------------


## [2\. Artículo de Compose](https://developer.android.com/codelabs/basic-android-kotlin-compose-composables-practice-problems?hl=es-419&continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-1-pathway-3%3Fhl%3Des-419%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-composables-practice-problems#1)

La app Learn Together muestra una lista de artículos sobre varias bibliotecas de Jetpack. Los usuarios pueden elegir el tema de su preferencia y conocer los desarrollos más recientes.

En este ejercicio, compilarás una pantalla para la app, que mostrará un instructivo para Jetpack Compose. En este problema, usarás los recursos de imágenes y strings que se proporcionan en la sección Recursos.

### Captura de pantalla final

Cuando termines la implementación, tu diseño debería coincidir con esta captura de pantalla:

![c8c16974d0aef074.png](https://developer.android.com/static/codelabs/basic-android-kotlin-compose-composables-practice-problems/img/c8c16974d0aef074.png?hl=es-419)

### Especificaciones de IU

Sigue las siguientes especificaciones de IU:

![Especificación de IU para compilar la pantalla de artículos de Compose.](https://developer.android.com/static/codelabs/basic-android-kotlin-compose-composables-practice-problems/img/905139e48ed11bee.png?hl=es-419)

1.  Configura la imagen de modo que ocupe el ancho completo de la pantalla.
2.  Configura el primer elemento `Text` componible con un tamaño de fuente `24sp` y un padding de `16dp` (inicio, fin, parte inferior y parte superior).
3.  Configura el segundo elemento `Text` que admite composición con un tamaño de fuente predeterminado, un padding de `16dp` (inicio y fin) y una alineación del texto de tipo `Justify`.
4.  Configura el tercer elemento `Text` que admite composición con un tamaño de fuente predeterminado, un padding de `16dp` (inicio, fin, parte inferior y parte superior) y una alineación del texto de tipo `Justify`.

### Recursos

Necesitas [esta imagen](https://github.com/google-developer-training/basic-android-kotlin-compose-training-practice-problems/blob/main/Unit%201/Pathway%203/ComposeArticle/app/src/main/res/drawable-nodpi/bg_compose_background.png) para [importar a tu proyecto](https://developer.android.com/codelabs/basic-android-kotlin-compose-add-images?hl=es-419#0) y estas strings:

-   `Jetpack Compose tutorial`
-   `Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.`
-   `In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. These functions let you define your app\'s UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI\'s construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name.`

Ayuda: ¿Qué elemento componible alinea sus elementos secundarios de forma vertical?

### Referencias

-   Propiedad [`TextAlign.Justify`](https://developer.android.com/reference/kotlin/androidx/compose/ui/text/style/TextAlign?hl=es-419#Justify\(\))