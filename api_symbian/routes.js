
const {Router} = require('express')
const routes = new Router()

const UsuarioControler = require('./controllers/UsuarioController')

routes.post('/usuario/cadastrar', UsuarioControler.cadastroUsuario)
routes.get('/usuario/listar', UsuarioControler.listarUsuario)


module.exports = routes