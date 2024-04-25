package com.example.restaurante

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.restaurante.databinding.ActivityMainBinding
import com.example.restaurante.databinding.ActivityPedidoBinding

class PedidoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pedido)
    }
    class PedidoActivity : AppCompatActivity(){
        private lateinit var binding: ActivityPedidoBinding
        override fun onCreate(savedInstanceState: Bundle?) {
            binding = ActivityPedidoBinding.inflate(layoutInflater)
            super.onCreate(savedInstanceState)
            setContentView(binding.root)

            val i = intent
            val quantidadePizza = i.getStringExtra("quantidadePizza").toString().toInt()
            val quantidadeSalada = i.getStringExtra("quantidadeSalada").toString().toInt()
            val quantidadeHamburger = i.getStringExtra("quantidadeHamburger").toString().toInt()

            val texto = "Resumo do Pedido\n" +
                    "Pizza: $quantidadePizza Preço: ${quantidadePizza*8}\n" +
                    "Salada: $quantidadeSalada Preço: ${quantidadeSalada*10}\n" +
                    "Hamburger: $quantidadeHamburger Preço: ${quantidadeHamburger*12}\n"

            binding.textResumo.text = texto

        }

    }

}

