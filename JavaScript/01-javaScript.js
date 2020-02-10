var json1 = {


    nombre: "Gabriel",
    edad: "19",
    casado: false,
    mascota: [
        'Cachetes'
    ],
    colegio: {
        nombreColegio: 'Murillo',
        telefono: 0996174424,
        a: ''
    }
}
console.log('hola');
console.log(json1.nombre);
console.log(json1['edad']);
console.log(json1.colegio.nombreColegio);

var a = 'aaa';
let b = true;
console.log(a);
a = true
console.log(a);



var arreglo = ['aa','aa',1,true,{a:1},['asd',12]]
console.log(arreglo);


var jsonGabriel = {
    nombre:'Gabriel',
    apelllido:'Fierro',
    edad:'19',
    cedula: 1752509206,
    direccion:'Carcelen Alto'
};
console.log("----------");
console.log(jsonGabriel);

console.log(jsonGabriel+json1);


var numero = 1;
var booleano=true;
console.log(json1 + booleano);

//Funciones

var mifuncion = function(n1,n2){
    //console.log('funcion 1');
    return n1+n2
};
var mifuncion2 = (n1,n2) =>{
    return n1+n2
};
console.log(mifuncion(2,546));
console.log(mifuncion2());

var jsonFunciones = {
    suma:()=>{
        return 2+3;
    },
    resta:()=>{
        return 2-3;
    },
    mustiplicacion:()=>{
        return 2*3;
    },
    division:()=>{
        return 2/3;
    }
}
console.log("Operaciones");
console.log("Suma: "+jsonFunciones.suma());
console.log("Resta: "+jsonFunciones.resta());
console.log("Multiplicacion: "+jsonFunciones.mustiplicacion());
console.log("Division: "+jsonFunciones.division());

//condicionales
var numero=10;
var numero2=9;
var numeromenoranumero2=numero2>numero;
var esigual=numero2 === numero;
var ifunalinea= 1==='1' ? false : true;

if (condition) {
    
}
while (condition) {
    
}
switch (key) {
    case value:
        
        break;

    default:
        break;
}
for (let index = 0; index < array.length; index++) {
    const element = array[index];
    
}
array.forEach(element => {
    
});