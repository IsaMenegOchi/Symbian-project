const {Router} = require('express')
const routes = new Router()

const UsuarioController = require('./controllers/UsuarioController')

routes.post('/usuario/cadastrar', UsuarioController.cadastro)
routes.get('/usuario/listar', UsuarioController.listar)


module.exports = routes