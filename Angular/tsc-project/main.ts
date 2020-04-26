import {Student} from './Student';


let a: number;
let b: boolean;
let c: string;
let d: any;
let arr: number[] = [1, 2, 3];
let arrAny: any[] = [1, true, "PUNE", 10.4];

const colorRed = 10;

enum Color{Red = 0, Blue = 1, Green = 2, White = 3, Black = 4};

console.log("Value of red : "+Color.Red);

let message = "This is TypeScript"

if(message.endsWith("TypeScript")){
    console.log("Ending with TypeScript");
}else{
    console.log("Not ending with TypeScript");
}

let anotherMessage;
anotherMessage = "This is also TypeScript";

if(anotherMessage.endsWith("TypeScript")){
    console.log(">> This also Ending with TypeScript");
}else{
    console.log(">> This Not ending with TypeScript");
}

if((<string>anotherMessage).endsWith("TypeScript")){
    console.log("This also Ending with TypeScript");
}else{
    console.log("This Not ending with TypeScript");
}


if((anotherMessage as string).endsWith("TypeScript")){
    console.log("This also Ending with TypeScript..");
}else{
    console.log("This Not ending with TypeScript..");
}

// Arrow Functions 

let printGreeting = (userName) => {
    console.log("Hello "+userName);
}

printGreeting("Vaibhav");


// Interfaces

interface Point{
    x: number;
    y: number;
}


let drawPoint = (point : {x: number, y: number})=>{
    console.log("X : "+point.x);
    console.log("Y : "+point.y);
}

let setPointLocation = (point: Point)=>{
    let x = point.x;
    let y = point.y;


    console.log("[x, y] = ["+x+", "+y+"]");
}

drawPoint({x: 5, y: 10});
setPointLocation({x:10, y:20})


// Class Usage


let s1 = new Student("vaibhav", 30);

s1.name = "Vaibhav"

console.log("Student Name : "+s1.name)