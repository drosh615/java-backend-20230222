console.log('hello')

// 1.변수 타입이 존재하지 않음
var variable_name = '변수값';
var variable_name;
console.log(variable_name.trim());
variable_name=10;
// console.log(variable_name.trim()); 타입이 존재하지 않아서 오류 발생에 취약/ 트림은 숫자 안되

/*
    2.변수 선언 키워드
    var, let, const
*/
if(1==1) {
    var variable_name2='변수';
}
console.log(variable_name2);

let let_variable_name
let let_variable_name1

if(1==1) {
    let let_variable_name2='변수';
}
//console.log(let_variable_name2);

const const_variable = '상수';
//const_variable = '변경 되나'

/* 3.데이터의 타입
    문자열, 숫자, 블린, 널, 언디파인, 나머지(배열,객체)
*/
// 문자열 string : ' ', " "
let stringVariable1 = '문자열';
let stringVariable2 = "문자열";
console.log(typeof(stringVariable1, stringVariable2))

// 숫자 number : 정수, 실수
let numberVariable1 =10;
let numberVariable2 =1.0;
console.log(typeof(numberVariable1, numberVariable2))

// 논리 boolean : true, false
let booleanVariable1 = true;
console.log(typeof(booleanVariable1));

// null
let nullVariable = null;
console.log(typeof(nullVariable));

// 배열 : []
let arrayVariable = [ 1, 'a', false];

// 객체 : {}
let objectVariable = {
    key: 'value',
    name: 'john',
    age: 20, 
    "object": {
        "key1": 1
    }
};

// 연산자 
// 1. 나눗셈 연산자 
let number1 = 10 / 3;
console.log(number1);
// 2. 제곱 연산자 (**) 
let number2 = 10 ** 3;
console.log(number2);
// 3. 비교연산 ==, === 
let numberValue10 = 10;
let stringValue10 = '10';
console.log(numberValue10 == stringValue10);
console.log(numberValue10 === stringValue10);

// if 조건 
let tmpValue = null;
if (tmpValue) console.log('true');
else  console.log('false');

// class 
class Human {
    name;
    age;
    address;
    constructor(name, age, address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
}

let humanObject = new Human('John', 30, '부산');
console.log(humanObject.name);

// 비구조화 할당 
// const { name, age, address } = humanObject;
let { name, ...others } = humanObject;
console.log(name);
console.log(others);

name = 'Micle';
humanObject = { ...humanObject, name };
// { name, age, address, name };
console.log(humanObject);

const tmpArray = [1, 'A', true];
const [number, ...otherArray] = tmpArray;
console.log(number);
console.log(otherArray);

// 함수 
function function1(arg, arg2) {

}
function1(1, 2);

const function2 = (arg1, arg2) => {

} 
function2(1, 2);