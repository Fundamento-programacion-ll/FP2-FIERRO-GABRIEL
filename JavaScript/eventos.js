const EventEmitter = require('events');

class eventoUno extends EventEmitter{}

var instanciaEventoUno = new eventoUno();

instanciaEventoUno.on('saludar', respuesta => {
    console.log('hola', respuesta);
    console.log(`asdfghj ${respuesta}`);
});

instanciaEventoUno.emit('saludar', 'Gabriel');
