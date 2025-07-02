// Variable Declaration: var, let, const
var name = "Sona";
let age = 34;
const country = "India";

// Scope differences
{
    var x = 10;
    let y = 20;
    const z = 30;
    console.log("Inside block: x =", x, ", y =", y, ", z =", z);
}
console.log("Outside block: x =", x);
// console.log(y); // Error: y is not defined outside block scope
// console.log(z); // Error: z is not defined outside block scope

// Primitive data types
let str = "Hello";
let num = 42;
let isHappy = true;
let empty = null;
let notDefined;
let unique = Symbol('id');
let bigIntNum = 1234567890123456789012345678901234567890n;

// typeof operator
console.log(typeof str, typeof num, typeof isHappy, typeof empty, typeof notDefined, typeof unique, typeof bigIntNum);

// Practice eg typeof operator:
let p = "28";
console.log(typeof p); // string ✅

let q = true;
console.log(typeof q); // boolean ✅ (Fixed: spelling was `cnsole.log`)

let c;
console.log(typeof c); // undefined ✅

let d = null;
console.log(typeof d); // object ✅ (JS quirk)

let e = 9999999999999999999999999999999999n;
console.log(typeof e); // bigint ✅

// Reference types
let arr = [1, 2, 3];
let obj = { name: "Sona", age: 28 };
function greet() {
    return "Hello!";
}
console.log(typeof arr, typeof obj, typeof greet); // object object function

// Type coercion & conversion
console.log("5" + 2);        // "52" (string + number → string)
console.log("5" - 2);        // 3 (string → number)
console.log(null + 1);       // 1
console.log(true + false);   // 1

// Arithmetic Operators
let a = 10, b = 3;
console.log(a + b, a - b, a * b, a / b, a % b, a ** b);

// Assignment Operators
a += 2;
b *= 3;
console.log("a =", a, "b =", b); // a = 12, b = 9

// Comparison Operators
console.log(5 == "5", 5 === "5", 5 != "5", 5 !== "5", 5 < 10); // true false false true true

// Logical Operators
console.log(true && false, true || false, !true); // false true false

// Ternary Operator
let result = (a % 2 === 0) ? "Even" : "Odd";
console.log("a is", result); // Even

// Arithmetic operation practice 
let r = 5;
let s = "5";
console.log(r == s); // true 

let x2 = 10;
x2 += 5;
console.log(x2); // 15

console.log(typeof null); // object (quirk)

// Fix: in this line, you used 'age' instead of 'age1'
let age1 = 17;
let status = (age1 >= 18) ? "Adult" : "Minor";
console.log(status); // Minor ✅

// Template literals
let msg = `Hi, my name is ${name} and I am ${age} years old from ${country}.`;
console.log(msg);

// Function to check even or odd
function checkEvenOdd(num1, num2) {
    let sum = num1 + num2;
    console.log(`Sum is ${sum}, which is ${sum % 2 === 0 ? "Even" : "Odd"}`);
}
checkEvenOdd(7, 3);

