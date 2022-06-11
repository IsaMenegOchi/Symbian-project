const db = require("../database/db")

const Usuario = db.sequelize.define('tblUsuario', {
    idUsuario: {
        type: db.Sequelize.INTEGER, 
        primaryKey: true,
        autoIncrement: true,
        allowNull: false
    },
    nome: {
        type: db.Sequelize.STRING(100),
        allowNull: false
    },
    sobrenome: {
        type: db.Sequelize.STRING(100),
        allowNull: false
    },
    email: {
        type: db.Sequelize.STRING(200),
        allowNull: false
    },
    celular: {
        type: db.Sequelize.STRING(100),
    }
})

// Usuario.sync({
//     force: true
// }) 
    //Depois de executado, comentar essa linha. 
    //Caso contrário, irá criar várias tabelas iguais toda vez.

module.exports = Usuario