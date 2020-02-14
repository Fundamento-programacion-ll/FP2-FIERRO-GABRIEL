/*
var arreglo = [
    {
        nombre: 'Gabriel',
        apellido: 'Fierro',
        edad: 19
    },
];
console.log("---Buscar---");
var buscarUnUsuario = (arreglo, usuarioaBuscar)=>{
    var usuarioEncontrado = arreglo.find((usuario)=>{
        if (usuarioaBuscar === '') {
            var agregar = arreglo.push({nombre: 'Marcela', apellido: 'Mora', edad: 66},);
            console.log(arreglo);
        }else{
            return usuario.nombre === usuarioaBuscar;
        };  
    });
    console.log(usuarioEncontrado);
};
buscarUnUsuario(arreglo, '');

console.log("---Agregar---");
var agregar = arreglo.push({nombre: "Alejandro", apellido: "Mora", edad: 23});
console.log(arreglo);

console.log("---Eliminar---");
var eliminar =(arreglo,usuarioaBuscar)=>{
    var usuarioEncontrado = arreglo.filter((usuario)=>{
        return usuario.nombre !== usuarioaBuscar;
    });
    console.log(usuarioEncontrado);
};
eliminar(arreglo, 'Gabriel');

*/
const moment = require('moment');


var fecha = new Date();
console.log(fecha);
console.log(fecha.getDate());
console.log(fecha.getDay());
console.log(fecha.getMonth());
console.log(fecha.getFullYear());

console.log(fecha.getDate(), fecha.getMonth(), fecha.getFullYear());

moment.locale('es');
const horaactual=moment().format('hh:mm:ss');
console.log(horaactual);
console.log(moment().add(3,'hours').toString());
console.log(moment().format('dddd'));
console.log(fecha.toISOString());
console.log(fecha.toDateString());
console.log(fecha.toUTCString());



console.log(moment().toObject()['years']);