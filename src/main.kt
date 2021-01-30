fun main() {

    val pedidos = listOf(
            Pedido(1, 20.0),
            Pedido(2, 60.0),
            Pedido(3, 30.0),
            Pedido(4, 70.0),
            Pedido(5, 40.0)
    )

    println(pedidos)
    val pedidosMapeados = pedidos.associateBy { pedido -> pedido.numero }
    println(pedidosMapeados)

    val pedidosFreteGratis = pedidos.associateWith { pedido ->
        pedido.valor > 50.0
    }
    println(pedidosFreteGratis)
    println(pedidosFreteGratis[Pedido(1, 20.0)])
    println(pedidosFreteGratis[Pedido(2, 60.0)])


//    val mapa = pedidos.associateBy { pedido -> pedido.valor > 50.0 }
//    println(mapa)

    val pedidosFreteGratisAgrupados = pedidos.groupBy { pedido: Pedido ->
        pedido.valor > 50.0
    }
    println(pedidosFreteGratisAgrupados)
    println(pedidosFreteGratisAgrupados[true])


    val nomes = listOf("Alex", "Fran", "Gui", "Ana", "Paulo", "Maria", "Mario", "Gisele")

    val agenda = nomes.groupBy { nome ->
        nome.first()
    }
    println(agenda)
    println(agenda['A'])



}


data class Pedido(val numero: Int, val valor: Double)