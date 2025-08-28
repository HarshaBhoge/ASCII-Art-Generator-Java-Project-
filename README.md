# ASCII-Art-Generator-Java-Project

This project converts images into ASCII art using Java. It reads an image, scales it down for better console visibility, converts each pixel into grayscale, and then maps brightness values to ASCII characters. The result is a text-based version of the image that can be displayed directly in the terminal.

---

## 📌 Features
- 📂 Read image files (`.png`, `.jpg`, etc.) using `ImageIO`.
- 🖼️ Resize image automatically while maintaining aspect ratio.
- 🌗 Convert image pixels to grayscale using the luminosity method.
- 🔡 Map grayscale brightness to ASCII characters.
- 💻 Display ASCII art directly in the console.
- ⚡ Lightweight and easy to run, no external libraries required.

---

## ⚙️ How It Works
1. **Image Loading**  
   The program uses `ImageIO.read(new File("image.png"))` to load the image into a `BufferedImage`.

2. **Resizing the Image**  
   Since images can be too large for console display, the width is reduced (default: `80px`) and the height is adjusted proportionally.

3. **Grayscale Conversion**  
   Each pixel is converted to grayscale using the **Luminosity Method**:  
   ```
   grayscale = 0.21 * Red + 0.72 * Green + 0.07 * Blue
   ```

4. **Mapping to ASCII Characters**  
   A set of ASCII characters (from lightest to darkest) is used:  
   ```
   {' ', '.', '*', ':', 'o', '&', '8', '#', '@'}
   ```
   Brighter pixels → lighter characters (like space or `.`).  
   Darker pixels → denser characters (`#`, `@`).

5. **Output**  
   The ASCII characters are printed row by row in the console to recreate the image.

---

## 📷 Example

### Sample Input
![Sample Input](sample2.jpeg)

### ASCII Output
```
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@8:. .*o8@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@o  .**.**.. :#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#. ***.....***. o@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#####@& ..**...******. :@@@@@@@@@@@@@@@@@@@@@@@@@@@
@@@@@@@@@@@@@@@@@@@@@@@@8* ....*...... .**..****..**. o@@@@@@@@@@@@@@@@@@@@@@@@@
@@@@@@@@@@@@@@@@@@@@@@#* .*************.  ..*******.*..*@@@@@@@@@@@@@@@@@@@@@@@@
@@@@@@@@@@@@@@@@@@@@@@#. ..***************......*******..#@@@@@@@@@@@@@@@@@@@@@@
@@@@@@@@@@@@@@@@@@@@@@@@#o*.  ..............*****..*****..#@@@@@@@@@@@@@@@@@@@@@
@@@@@@@@@@@@@@@@@@@@@@@@@@@#:.  ..***....****************.  .o#@@@@@@@@@@@@@@@@@
@@@@@@@@@@@@@@@@@@@@@@@@@8.  .*******...********************.. .o@@@@@@@@@@@@@@@
@@@@@@@@@@@@@@@@@@@@@@@&  .********......****...***************.. *#@@@@@@@@@@@@
@@@@@@@@@@@@@@@@@@@@@8. .*****************************************. .8@@@@@@@@@@
@@@@@@@@@@@@@@@@@@@#. .*********************************************. *#@@@@@@@@
@@@@@@@@@@@@@@@@@@&  .******************************************...**.. o@@@@@@@
@@@@@@@@@@@@@@@@@* .********************************************....**.* .#@@@@@
@@@@@@@@@@@@@@@#. .*********************************************...***.**..8@@@@
@@@@@@@@8:#@@@#. .***........*****************************...*************. &@@@
@@@@@@&.  *#@@..*****........*********.**.  ...***********...**************. 8@@
@8:&#@8.  ..#* *****..****************.*.         ...**************...        #@
8. .  *&8*..  .*************************.               ...***..              *@
* ...  . ... ..********************...****.......                          ... 8
@#8o:*.....  .**..********************....*..:@@@@@@#8&:*.    ..:o&##@@8.***** :
@@@@@8:..   ..**.****************............8@@@@@@:   :@@*&@* .&@@@@@@o....* .
@@@@@*  .&8 .****************.........*..... &@@@@@@o   :@@*o@.  o@@@@@@&...**. 
@@@@@#o#@@8 .******...*********........*......8#@@@@@@@@8*.:*.*&@@@@@@@8.....*. 
@@@@@@@@@@8 .******...*......**............... .&####8*:88888888:*&##&*......* .
@@@@@@@@@@8 .******...*......**..................   *8888888888888&: ......... :
@@@@@@@@@@#* ******...*.......**......**..........:888888888888888888o......*. 8
@@@@@@@@@@@o .*****................********::::: o888888888888888888888:..**. *@
@@@@@@@@@@@@* .*****.........***.*:o&88888888888* .*:o&88888888888888888o..*  #@
@@@@@@@@@@@@#. .****.........*:&88888888888888888&.:&&&&&&ooo:::****..... .  &@@
@@@@@@@@@@@@@#.  .****....*o88888888888888888888888o.o&&&&&&&&&&&&o.*****.  &@@@
@@@@@@@@@@@@@@@o  .*.****&888888888888888888888888888:.o&&&&&&&o...*****. .8@@@@
@@@@@@@@@@@@@@@@#:   .:88888888888888888888888888888888: :&&o..o88&**..  o@@@@@@
@@@@@@@@@@@@@@@@@@@&.  .o88888888888888888888888888888888o..o888888:   :@@@@@@@@
@@@@@@@@@@@@@@@@@@@@@@&.   .o8888888888888888888888888888888888&*   .8@@@@@@@@@@
@@@@@@@@@@@@@@@@@@@@@@@@@#o.    .*:&8888888888888888888888o*.    :#@@@@@@@@@@@@@
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#&*.        ..........        :&#@@@@@@@@@@@@@@@@@
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#8&o::::*::::o&8##@@@@@@@@@@@@@@@@@@@@@@@@

```


## 🚀 Getting Started

### Prerequisites
- Install **Java JDK 8+**
- Place an image (e.g., `sample2.png`) in your project directory.

### Run the Program
```bash
javac code.java
java code
```

---

## 📚 Concepts Covered
- File Handling → Reading images with `ImageIO`.
- Graphics in Java → Resizing images using `BufferedImage`.
- Image Processing → Pixel-level operations, RGB to grayscale conversion.
- ASCII Mapping → Translating brightness into characters.
- Error Handling → Using `try-catch` for `IOException`.

---
## 🎮 Try It Yourself
- Fork this repo 🍴  
- Add your own image (`.png` / `.jpg`)  
- Run the program and share your ASCII art in **Issues** or **Pull Requests**  

