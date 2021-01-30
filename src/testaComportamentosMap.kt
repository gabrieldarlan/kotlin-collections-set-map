
fun testaComportamentosMap() {
    val pedidos = mutableMapOf(
            1 to 20.0,
            2 to 64.0,
            3 to 50.0,
            4 to 100.0,
            5 to 100.0,
            6 to 80.0
    )

//    val valorPedido = pedidos.getValue(5)
//    println(valorPedido)

    val mensagem = pedidos.getOrElse(5, {
        0.0
    })
    println(mensagem)
    println(pedidos.getOrDefault(0, -1.0))
    println(pedidos.keys)
    println(pedidos.values)

    for (numero in pedidos.keys) {
        println("Pedido $numero")
    }

    pedidos.values.forEach { println("Valor $it") }

    val pedidosFiltados = pedidos.filter { (numero, valor) ->
        numero % 2 == 0 && valor >= 50.0
    }
    println(pedidosFiltados)

    val pedidosAcima = pedidos.filterValues { valor -> valor >= 70.0 }
    println(pedidosAcima)

    val pedidosPares = pedidos.filterKeys { numero -> numero % 2 == 0 }
    println(pedidosPares)

    println(pedidos + Pair(7, 90.0))
    println(pedidos)

    println(pedidos - listOf(6, 5))
    println(pedidos)

//    pedidos.putAll(listOf(7 to 90.0, 8 to 20.0))
    pedidos += listOf(7 to 90.0, 8 to 20.0)
    println(pedidos)


    pedidos.keys.remove(1)
    println(pedidos)

    pedidos.values.remove(50.0)
    println(pedidos)

    pedidos.values.remove(100.0)

    pedidos -= 6
}
