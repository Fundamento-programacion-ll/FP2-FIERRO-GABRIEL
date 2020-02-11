/*
var nombre = 'gabriel';
var b="";
var tn=nombre.length;
console.log(nombre.length);
console.log(nombre.indexOf('r'));
console.log(nombre.search("el"));

console.log(nombre.substr(0,7));

while (tn >= 0){
    b+= nombre.charAt(tn)
    console.log(b);
    tn--
}

console.log(nombre.slice(1,-3));
console.log(nombre.split(""));

var texto = "Hola mundo"
console.log("Antes",texto);
console.log("Despues");
console.log(texto.replace("mundo","world"));

var ejemplotrim="            hola aaaa   "
console.log(ejemplotrim);
console.log(ejemplotrim.trim());

console.log(ejemplotrim.trim().concat("",nombre));
console.log(ejemplotrim.localeCompare("a"));
console.log(ejemplotrim.toLocaleUpperCase());
*/
console.log("Actividad en Clase");
/*
Primera palabra mayuscula, inicio mitad final
contar cuantos ; o , o .
espacion con *-*
*/
/*
var noticia = 'Realiza fotografías de 20 megapíxeles y puede utilizar un perfil de color Dlog-M de 10 bits, con el que se obtiene un rango dinámico más amplio al registrar hasta mil millones de colores. Esto queda bastante por encima de los 16 millones de colores de los perfiles de 8 bits, pudiendo dejar más margen y libertad en la edición posterior del material. Por su parte, el Mavic 2 Zoom cuenta con un sensor CMOS de 1/2,3 pulgadas y zoom óptico, lo cual da nombre al propio producto. En este caso es capaz de realizar capturas de 12 megapíxeles, disponiendo un zoom automático híbrido (que combina detección de fase y contraste) de una función de "Superresolución" que recurre al zoom óptico para realizar nueve fotografías y componer una sola con todas ellas de 48 megapíxeles (con más detalle).'
*/
var noticia = 'Realiza fotografías de 20 megapíxeles y puede utilizar un perfil de color Dlog-M de 10 bits, con el que se obtiene un rango dinámico más amplio al registrar hasta mil millones de colores. Esto queda bastante por encima de los 16 millones de colores de los perfiles de 8 bits, pudiendo dejar más margen y libertad en la edición posterior del material. Por su parte, el Mavic 2 Zoom cuenta con un sensor CMOS de 1/2,3 pulgadas y zoom óptico, lo cual da nombre al propio producto. En este caso es capaz de realizar capturas de 12 megapíxeles, disponiendo un zoom automático híbrido (que combina detección de fase y contraste) de una función de "Superresolución" que recurre al zoom óptico para realizar nueve fotografías y componer una sola con todas ellas de 48 megapíxeles (con más detalle).'
console.log(noticia.length);
console.log(noticia.substr(0,7).toLocaleUpperCase());
console.log(noticia.slice(395,402).toLocaleUpperCase());
console.log(noticia.slice(-9,-2).toLocaleUpperCase());
console.log(noticia.split('*_*',noticia.length));






