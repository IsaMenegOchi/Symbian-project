const express = require('express');

const Usuario = require('../models/Usuario')

const router = express.Router();

router.post('/usuario/cadastrar', (req, res)=>{

        const {
            nome,
            sobrenome,
            email,
            celular,
        } = req.body


        const usuario =  Usuario.create({
            nome,
            sobrenome,
            email,
            celular,
        })

        return res.status(201).json(usuario)

    })

router.get('/usuario/listar', (req, res) => {

    Usuario.findAll()
    .then(
            (usuario)=>{
                res.status(200).json(usuario);
            }       
    );
    
})

module.exports = router