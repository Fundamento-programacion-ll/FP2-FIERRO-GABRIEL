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

