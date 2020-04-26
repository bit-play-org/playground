"use strict";
exports.__esModule = true;
var Student = /** @class */ (function () {
    function Student(_name, _age) {
        this._name = _name;
        this._age = _age;
    }
    Object.defineProperty(Student.prototype, "name", {
        get: function () {
            return this._name;
        },
        // define properties
        set: function (name) {
            this._name = name;
        },
        enumerable: true,
        configurable: true
    });
    return Student;
}());
exports.Student = Student;
var s1 = new Student("vaibhav", 30);
s1.name = "Vaibhav";
console.log("Student Name : " + s1.name);
