const express = require("express")
const app = express()
const routes = require('./routes')


app.use(express.json());
app.use(express.urlencoded({ extended: true }));
app.use(routes)

const usuarioController = require('./controllers/UsuarioController');
// app.use('/', usuarioController);

app.listen(4000, function () {
    console.log("Servidor rodando na url http://localhost:4000")
})