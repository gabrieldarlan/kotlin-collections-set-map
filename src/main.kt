fun main() {

    val pedidos = mutableMapOf(
        1 to 20.0,
        2 to 34.0,
        3 to 45.0
    )
    println(pedidos)
    val pedido = pedidos[3]
    pedido?.let {
        println("pedito $it")
    }
    for (p: Map.Entry<Int, Double> in pedidos) {
        println("numero do pedido: ${p.key}")
        println("valor do pedido: ${p.value}")
    }
    pedidos[4] = 70.0
    println(pedidos)
    pedidos.put(5, 80.0)
    println(pedidos)
    pedidos[1] = 100.0
    println(pedidos)
    pedidos.putIfAbsent(6, 200.0)
    println(pedidos)
    pedidos.putIfAbsent(6, 300.0)

    pedidos.remove(6)
    println(pedidos)
    pedidos.remove(3,45.0)
    println(pedidos)



}


