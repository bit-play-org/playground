export class Student{
    constructor(private _name?:string, private _age ?:number){

    }

    // define properties
    set name(name:string){
        this._name = name;
    }
    get name(){
        return this._name;
    }


}

let s1 = new Student("vaibhav", 30);

s1.name = "Vaibhav"

console.log("Student Name : "+s1.name)