import java.util.*;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static Scanner messageNumberOne = new Scanner(System.in);
    public static Scanner messageNumberTwo = new Scanner(System.in);
    public static Scanner messageNumberThree = new Scanner(System.in);

    public static void main(String[] args) {
       // 1:
       // calculateANumber();

       // 2:
       // findOddOrEvenNumber();

       // 3:
       // calculatePerimeterAndCircleArea();

       // 4:
       //IsLegalAgeOrUnderage();

       // 5:
       // whichIsGreater();

       //6:
       // PositiveNegativeOrZero();

       // 7:
       // multiplicationTable();

       // 8:
       // guessTheNumber();

       // 9:
       //computeFactorials();

       // 10:
       // numbersFibonacci();

       // 11:
       // findAreaOfATriangle();

       // 12:
       // PrimeNumber();

       // 13:
       // formatIntoDecimal();

       // 14:
       // perfectNumber();

       // 15:
       // ifItIsPalindromic();

       // 16:
       // SFWithLength();

       // 17:
       // PrimeNumberWithRange();

       // 18:
       // passwordGenerator();

       // 19:
       // nameInUpperCaseAndLowerCase();

       // 20:
       // reverseString();

       // 21:
       // sameCharInString();

       // 22:
       //textIsPalindrome();

       // 23:
       // countWords();

       // 24:
       //replaceCharacter();

       // 25:
       // phraseSeparated();

       // 26:
       // countCharacters();

       // 27:
       // textAlphabetically();

       // 28:
       // SumOfAnArray();

       // 29:
       // numberHigher();

       // 30:
       // deleteDuplicate();

       // 31:
       //sortAscending();

       // 32:
       // searchInArray();

       // 33:
       // elementFrequency();

       // 34:
       // arrayRotation();
       // 35:
       // multiplicationTables();



    }

    // 1. Realiza un programa que solicite al usuario dos números enteros y muestre su suma, resta, multiplicación y división */
    /* public static void calculateANumber() {
        System.out.println("Enter first number");
        float numberOne = messageNumberOne.nextFloat();

        System.out.println("Enter second number");
        float numberTwo = messageNumberTwo.nextFloat();

        float sum = numberOne + numberTwo;
        float subtract = numberOne - numberTwo;
        float multiplication = numberOne * numberTwo;
        float division =  numberOne / numberTwo;

        if (numberTwo == 0){
            System.out.println("sum: " + sum + " subtract: " + subtract + " multiplication:  " + multiplication + " division: " + " cannot be divided by 0");
        } else{
            System.out.println("sum: " + sum + " subtract: " + subtract + " multiplication: " + multiplication + " division: " + division);
        }


    } */

    // 2. Escribe un programa que pida al usuario un número entero y determine si es par o impar. */
     /*   public static void findOddOrEvenNumber(){
            System.out.println("Enter a number");
            float number = messageNumberOne.nextFloat();

        if (number % 2 == 1 ){
            System.out.println("Is an even number");
        }
        else {
            System.out.println("Is an odd number");
        }
        }
}; */

   // 3. Crea un programa que calcule y muestre el área y el perímetro de un círculo. El usuario debe proporcionar el radio del círculo. */

    /* public static void calculatePerimeterAndCircleArea(){
            System.out.println("Enter an radio");
            float radio = messageNumberOne.nextFloat();

            double perimeter = 2 * Math.PI * radio;
            double area = Math.PI * Math.pow(radio, 2);

            System.out.println("The perimeter of this circle is: " + perimeter);
            System.out.println("The area of this circle is: " + area);
        }; */

    // 4. Pide al usuario su edad y muestra un mensaje indicando si es mayor de edad o menor de edad.

      /*  public static void IsLegalAgeOrUnderage(){
            System.out.println("Enter your age");
            float age = messageNumberOne.nextFloat();

            if (age >= 18){
                System.out.println("You are legal age");
            } else{
                System.out.println("You are underage");
            }

        } */

    // 5. Realiza un programa que solicite al usuario dos números enteros y determine cuál es el mayor de ellos.

      /*  public static void whichIsGreater(){

            System.out.println("Enter first number");
            int numberOne = messageNumberOne.nextInt();

            System.out.println("Enter second number");
            int numberTwo = messageNumberTwo.nextInt();

            if (numberOne > numberTwo){
                System.out.println( numberOne + " is greater");
            }
            else if(numberTwo>numberOne){
                System.out.println( numberTwo + " is greater");
            }
            else {
                System.out.println("Both numbers are equal");
            }

        }; */

    // 6. Escribe un programa que pida al usuario un número y verifique si es positivo, negativo o cero.

          /*  public static void PositiveNegativeOrZero(){
                System.out.println("Enter a number");
                float number = messageNumberOne.nextFloat();

                if (number > 0){
                    System.out.println("The number is positive.");
                } else if (number < 0){
                    System.out.println("The number is negative.");
                } else{
                    System.out.println("The number is zero.");
                }
            }; */
    // 7. Crea un programa que pida al usuario un número entero positivo y muestre su tabla de multiplicar hasta el 10.

      /*  public static void multiplicationTable(){
            System.out.println("Enter a number");
            int number = messageNumberOne.nextInt();

            for (int i = 0; i<=10; i++){
                System.out.println(number + " * " + i + "  =  " + number * i  );
            }
        }; */

    // 8. Realiza un programa que simule un juego de adivinar un número. El programa debe generar un número aleatorio entre 1 y 100,
    // y el usuario debe adivinarlo. El programa debe indicar si el número ingresado es mayor o menor que el número a adivinar.

    /* public static void guessTheNumber(){
        Random random = new Random();
        int randomNumber = random.nextInt(100) +1;
        boolean guessed = false;
        System.out.println(randomNumber);

         System.out.println("Enter a number ");

        while (!guessed) {
            int userNumber = messageNumberOne.nextInt();
            if (userNumber == randomNumber) {
                System.out.println("Right! You guessed the number");
                guessed = true;
            } else if (userNumber < randomNumber) {
                System.out.println("The number is higher. Try again: ");

            } else {
                System.out.println("The number is smaller. Try again: ");

            }
        }
    }; */

   // 9. Escribe un programa que solicite al usuario un número entero positivo y calcule su factorial.

       /* public static void computeFactorials(){


            System.out.println("Enter a number");
            int number = messageNumberOne.nextInt();

            if(number >= 0){
                double fact = factorial(number);
                System.out.printf("%d! = %.0f%n", number, fact);
            }
            else{
                System.out.println("Enter an integer and positive number");
            }
        }

        public static double factorial(int num){

            if (num == 0 || num == 1) {
                return 1;
            } else {
                long fact = 1;
                for (int i = 1; i <= num; i++) {
                    fact *= i;
                }
                return fact;
            }
        }; */

    // 10. Crea un programa que muestre los primeros 20 números de la serie Fibonacci.
    // La serie Fibonacci se forma sumando los dos números anteriores para obtener el siguiente número: 0, 1, 1, 2, 3, 5, 8, 13, …

       /* public static void numbersFibonacci(){
            int lengthNumbers = 20;
            for(int i = 0; i<lengthNumbers; i++){
                System.out.println(calculateFibonacci(i));
            }

        }

        public static int calculateFibonacci(int num){
           if (num == 0 || num == 1){
               return num;
           } else{
               return calculateFibonacci(num -1) + calculateFibonacci(num -2);
           }

        };*/


    // 11. Escribe un programa que calcule el área de un triángulo utilizando la fórmula de Herón.
    // El usuario debe ingresar las longitudes de los tres lados.

    /* public static void findAreaOfATriangle(){

     System.out.println("Enter a");
        double a = messageNumberOne.nextDouble();

        System.out.println("Enter b");
        double b = messageNumberTwo.nextDouble();

        System.out.println("Enter c");
        double c = messageNumberThree.nextDouble();

        double semiPerimeter = (a + b + c)/2;
        double area =  Math.sqrt(semiPerimeter*(semiPerimeter-a)* (semiPerimeter-b)*(semiPerimeter-c));

        System.out.println("The area of the triangle is: " + area + " cm2");

    }; */

     // 12. Realiza un programa que pida al usuario un número entero y determine si es un número primo o no

  /*  public static void PrimeNumber(){

       System.out.println("Enter a number");
        int number = messageNumberOne.nextInt();
        if(isPrime(number)){
            System.out.println(number + " Is prime");
        } else {

            System.out.println(number + " Is not a prime");
        }
    };

    public static boolean isPrime(int num){
        if (num <= 1){
            return false;
        }
        for (int i = 2; i < num ; i++){
            if (num % i == 0){
                return false;
            }
        };
        return true;
    }; */

    // 13. Pide al usuario un número decimal y muestra su valor redondeado a un número específico de decimales.

   /* public static void formatIntoDecimal(){
        System.out.println("Enter a number");
        double number = messageNumberOne.nextFloat();


        System.out.println("Enter the number of decimals to round to: ");
        int decimals = messageNumberOne.nextInt();

        double numberFormatted =  Math.pow(10, decimals);
        double roundedNumber = Math.round(number*numberFormatted)/numberFormatted;
        System.out.println("The rounded number is " + roundedNumber);

    } */


    // 14. Escribe un programa que solicite al usuario un número entero positivo y verifique si es un número perfecto.
    // Un número perfecto es aquel cuya suma de sus divisores propios (excluyendo al propio número) es igual al número.

      /*  public static void perfectNumber(){

            System.out.println("Enter a number");
            long number = messageNumberOne.nextLong();
            long sum = 0;

            for (int i = 1; i < number; i++ ){
                if(number % i == 0){
                    sum += i;
                }
            }
            if (sum == number){
                System.out.println(number + " is a perfect number");
            } else{
                System.out.println(number + " is not a perfect number");
            }
        } */

    // 15. Crea un programa que pida al usuario un número entero y determine si es un número capicúa.
    // Un número capicúa es aquel que se lee igual de izquierda a derecha que de derecha a izquierda.
    /* public static void ifItIsPalindromic(){
        System.out.println("Enter a number");
        int number = messageNumberOne.nextInt();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.valueOf(number)).reverse();

        if(String.valueOf(number).contentEquals(stringBuilder)){
            System.out.println("The number is palindromic");
        } else{
            System.out.println("The number is not palindromic");
        };

    } */

    // 16. Realiza un programa que calcule e imprima la serie de Fibonacci hasta un número dado ingresado por el usuario.

    /* public static void SFWithLength(){

        System.out.println("Enter how many fibonacci numbers you want to see ");
        int lengthNumbers = messageNumberTwo.nextInt();
        for(int i = 0; i<lengthNumbers; i++){
                System.out.println(calculateFibonacci(i));
            }
    }

    public static int calculateFibonacci(int num){
        if (num == 0 || num == 1){
            return num;
        } else{
            return calculateFibonacci(num -1) + calculateFibonacci(num -2);
        }

    }; */

    // 17. Pide al usuario dos números enteros y muestra todos los números primos que se encuentran en ese rango.

    /* public static void PrimeNumberWithRange(){

       System.out.println("Enter the first number");
        int numberOne = messageNumberOne.nextInt();
        System.out.println("Enter the second number");
        int numberTwo = messageNumberTwo.nextInt();

        System.out.println("The prime numbers are: ");
        for (int i = numberOne; i <= numberTwo; i++){

            if(isPrime(i)){
                System.out.println(i);
            }
        }
    };

    public static boolean isPrime(int num){
        if (num <= 1){
            return false;
        }
        for (int i = 2; i < num ; i++){
            if (num % i == 0){
                return false;
            }
        };
        return true;
    }; */

    // 18. Crea un programa que genere una contraseña aleatoria de 8 caracteres que
    //contenga letras mayúsculas, letras minúsculas y dígitos. Puedes utilizar la
    //clase Math para generar números aleatorios y la clase String para manipular
    //la contraseña.

   /* public static void passwordGenerator(){

         String password = passwordGenerate(8);
        System.out.println("Password generate: " + password);

    }

    public static String passwordGenerate(int length){

        String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";

        String allCharacters = upperCaseLetters + lowerCaseLetters + digits;

        StringBuilder passwordBuilder = new StringBuilder();

        Random random = new Random();

        for (int i=0; i < length; i++){

            int randomIndex = random.nextInt(allCharacters.length());
            char randomChar = allCharacters.charAt(randomIndex);
            passwordBuilder.append(randomChar);
        }
        return passwordBuilder.toString();
    } */

    // 19. Escribe un programa que solicite al usuario su nombre y luego lo imprima en
    //mayúsculas y minúsculas

   /* public static void nameInUpperCaseAndLowerCase(){

        System.out.println("Enter your name");
        String name = messageNumberOne.next();
        String nameToUpperCase = name.toUpperCase();
        String nameToLowerCase = name.toLowerCase();

        if(name.matches("[0-9]+")){
            System.out.println("Ingrese un nombre valido");
        }
        else {
            System.out.println("Your name in capital letter is: " + nameToUpperCase);
            System.out.println("Your name in lower case is: " + nameToLowerCase);
        }

    } */

    // 20. Realiza un programa que solicite al usuario una cadena y luego invierta su
    //orden

    /* public static void reverseString(){
        System.out.println("Enter a text");
        String string = messageNumberOne.nextLine();


        StringBuilder stringBuilder = new StringBuilder(string);
        String stringInverted = stringBuilder.reverse().toString();

        System.out.println("Original string: "+ string);
        System.out.println("Inverted string: " + stringInverted);
    } */

    // 21. .Pide al usuario una cadena y muestra cuántas veces aparece una letra
    //específica en ella

    /* public static void sameCharInString(){
        System.out.println("Enter a text");
        String string = messageNumberOne.nextLine();

        Map<Character, Integer> charCountMap = new HashMap<>();

        for (int i = 0; i < string.length(); i++){
            char charOfString = string.charAt(i);
            charCountMap.put(charOfString, charCountMap.getOrDefault(charOfString, 0)+ 1);
        }

        System.out.println("Enter a specific character:");
        char specificChar = messageNumberOne.next().charAt(0);

        int count = charCountMap.getOrDefault(specificChar, 0);

        System.out.println("The character " + specificChar + " appears " + count + " time(s) in the string.");
    } */

    // 22. Escribe un programa que solicite al usuario una frase y verifique si es un
    //palíndromo (se lee igual de izquierda a derecha que de derecha a izquierda)

    /* public static void textIsPalindrome(){

        // No ingresar tildes

        System.out.println("Enter a text");
        String string = messageNumberOne.nextLine();

        String cleanString = string.replaceAll("[\\s\\p{Punct}]", "").toLowerCase();
        StringBuilder stringBuilder = new StringBuilder(cleanString);
        String stringInverted = stringBuilder.reverse().toString();

        if (cleanString.equalsIgnoreCase(stringInverted)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is NOT a palindrome!");
        }
    } */

    //23. Crea un programa que pida al usuario una oración y muestre cuántas
    //palabras contiene

    /* public static void countWords(){

        System.out.println("Enter a text");
        String string = messageNumberOne.nextLine();

        int wordCount = counterWords(string);
        System.out.println("Number of words: " + wordCount);
    }
    public static int counterWords(String sentence){

        if (sentence == null || sentence.isEmpty()){
            return 0;
        }

        String[] words = sentence.split("\\s+");
        return words.length;
    } */


    // 24. Realiza un programa que solicite al usuario una cadena y reemplace todas
    //las apariciones de una letra específica por otra

    /* public static void replaceCharacter(){

        System.out.println("Enter a word:");
        String string = messageNumberOne.next();

        System.out.println("Enter the character to change:");
        char charToReplace  = messageNumberOne.next().charAt(0);

        System.out.println("Enter the character to replace with:");
        char replaceChar = messageNumberOne.next().charAt(0);

        String result = string.replace(charToReplace,replaceChar);
        System.out.println("Modified string: " + result);
    }*/

    // 25. Pide al usuario una frase y muestra cada palabra por separado

    /* public static void phraseSeparated(){
        System.out.println("Enter a phrase");
        String phrase = messageNumberOne.nextLine();

        String[] wordOfPhrase = phrase.split(" ");

        for (String word: wordOfPhrase) {
            System.out.println(word);
        }
    } */

    // 26. Escribe un programa que pida al usuario una cadena y muestre cuántos
    //caracteres tiene sin contar los espacios en blanco

    /* public static void countCharacters(){

        System.out.println("Enter a text");
        String text = messageNumberOne.nextLine();

        String textFormatted = text.replace(" ", "");

        int countCharacterOfText = textFormatted.length();

        System.out.println("The number of characters in this text is: " + countCharacterOfText);


    } */

    // 27. .Crea un programa que solicite al usuario una frase y luego muestre las
    //palabras ordenadas alfabéticamente

    /* public static void textAlphabetically(){

        System.out.println("Enter a text");
        String text = messageNumberOne.nextLine();

        String[] words = text.split(" ");

        Arrays.sort(words);

        System.out.println("Words in alphabetical order:");
        for(String word : words){

            System.out.println(word);
        }
    } */

    // 28. Suma de elementos: Escribe un programa que calcule la suma de todos los
    //elementos en un arreglo de enteros.

    /* public static void SumOfAnArray(){

       int[] array = {1,2,3,4,5,6};

       int sum = 0;

       for (int i =0; i < array.length; i++){
            sum += array[i];
       }

        System.out.println("La suma de este array es de: " + sum);
    } */

    // 29. Encontrar el número más grande: Crea un programa que encuentre el número
    //más grande en un arreglo de enteros

    /* public static void numberHigher(){

        Integer[] array = {6,5,4,13,16,30};

        Arrays.sort(array, Collections.reverseOrder());
        System.out.println(array[0]);
    } */

    // 30. Eliminar duplicados: Diseña un programa que elimine los elementos
    //duplicados de un arreglo.

    /* public static void deleteDuplicate(){

        Integer[] array = {30,4,5,23,16,30};
        Set<Integer> set = new HashSet<>(Arrays.asList(array));

        Integer[] result = set.toArray(new Integer[0]);

        System.out.println("Original array: " + Arrays.toString(array));
        System.out.println("Array with duplicates removed: " + Arrays.toString(result));
    } */

    // 31. Ordenar elementos: Implementa un algoritmo de ordenamiento (por ejemplo,
    //el algoritmo de burbuja o el de selección) para ordenar un arreglo de enteros
    //de manera ascendente

    /*public static void sortAscending() {
            int[] array = {2,4,5,34,223,454,32,44};
            Arrays.sort(array);

            System.out.println("Original array: " + Arrays.toString(array));

        System.out.println("Array sorted ascending: ");
            for (int i = array.length-1; i>=0; i--){
                System.out.println(""+ array[i]);
            }
    } */

    // 32. .Buscar un elemento: Escribe un programa que busque un número específico
    //en un arreglo y muestre su índice (o un mensaje si no se encuentra).


     /*   public static void searchInArray() {
            int[] array = {10, 23, 5, 10, 30, 18, 2, 21};

            System.out.print("Enter the number you want to search for: ");
            int targetNumber = messageNumberOne.nextInt();

            int foundIndex = -1;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == targetNumber) {
                    foundIndex = i;
                    break;
                }
            }

            if (foundIndex != -1) {
                System.out.println("The number " + targetNumber + " is found at index " + foundIndex);
            } else {
                System.out.println("The number " + targetNumber + " is not found in the array.");
            }
        } */

    // 33. Frecuencia de elementos: Escribe un programa que cuente la frecuencia de
    //cada elemento en un arreglo.

      /* public static void elementFrequency() {
            int[] array = {2, 5, 2, 8, 4, 7, 2, 5, 9, 4, 4, 2, 7};

            Map<Integer, Integer> frequencyMap = new HashMap<>();

            for (int num : array) {
                if (frequencyMap.containsKey(num)) {
                    int frequency = frequencyMap.get(num);
                    frequencyMap.put(num, frequency + 1);
                } else {
                    frequencyMap.put(num, 1);
                }
            }
            System.out.println("Original array" + Arrays.toString(array));
            for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
                int element = entry.getKey();
                int frequency = entry.getValue();
                System.out.println(element + " frequency: " + frequency);
            }
        } */

    // 34. Rotación de elementos: Implementa un programa que rote los elementos de
    //un arreglo hacia la izquierda o la derecha una cierta cantidad de posiciones.


    /* public static void arrayRotation(){

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        int positionsToRotate = 2;

        Collections.rotate(list, -positionsToRotate);
        System.out.println("Array rotated to the left: "+ list);

        Collections.rotate(list, positionsToRotate);
        System.out.println("Array rotated to the right: " + list);
    } */

    // 35. Tabla de multiplicar: Crea un programa que imprima las tablas de multiplicar
    //del 1 al 10. Usa para esto una matriz

    /* public static void multiplicationTables(){

        int[][] multiplicationTable = new int[10][10];

        for (int i = 0; i<10; i++){
            for (int j = 0; j<10; j++){
                multiplicationTable[i][j] = (i + 1) * (j + 1);
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Multiplication table of the " + (i + 1) + ":");
            for (int j = 0; j < 10; j++) {
                System.out.println((i + 1) + " x " + (j + 1) + " = " + multiplicationTable[i][j]);
            }
            System.out.println();
        }

    } */


}









