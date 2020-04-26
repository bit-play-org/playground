"use strict";
exports.__esModule = true;
var Student_1 = require("./Student");
var a;
var b;
var c;
var d;
var arr = [1, 2, 3];
var arrAny = [1, true, "PUNE", 10.4];
var colorRed = 10;
var Color;
(function (Color) {
    Color[Color["Red"] = 0] = "Red";
    Color[Color["Blue"] = 1] = "Blue";
    Color[Color["Green"] = 2] = "Green";
    Color[Color["White"] = 3] = "White";
    Color[Color["Black"] = 4] = "Black";
})(Color || (Color = {}));
;
console.log("Value of red : " + Color.Red);
var message = "This is TypeScript";
if (message.endsWith("TypeScript")) {
    console.log("Ending with TypeScript");
}
else {
    console.log("Not ending with TypeScript");
}
var anotherMessage;
anotherMessage = "This is also TypeScript";
if (anotherMessage.endsWith("TypeScript")) {
    console.log(">> This also Ending with TypeScript");
}
else {
    console.log(">> This Not ending with TypeScript");
}
if (anotherMessage.endsWith("TypeScript")) {
    console.log("This also Ending with TypeScript");
}
else {
    console.log("This Not ending with TypeScript");
}
if (anotherMessage.endsWith("TypeScript")) {
    console.log("This also Ending with TypeScript..");
}
else {
    console.log("This Not ending with TypeScript..");
}
// Arrow Functions 
var printGreeting = function (userName) {
    console.log("Hello " + userName);
};
printGreeting("Vaibhav");
var drawPoint = function (point) {
    console.log("X : " + point.x);
    console.log("Y : " + point.y);
};
var setPointLocation = function (point) {
    var x = point.x;
    var y = point.y;
    console.log("[x, y] = [" + x + ", " + y + "]");
};
drawPoint({ x: 5, y: 10 });
setPointLocation({ x: 10, y: 20 });
// Class Usage
var s1 = new Student_1.Student("vaibhav", 30);
s1.name = "Vaibhav";
console.log("Student Name : " + s1.name);
