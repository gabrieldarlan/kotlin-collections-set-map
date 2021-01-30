fun testaCopia() {
    val banco = BancoDenomes()
    val nomesSalvos: Collection<String> = banco.nomes
    banco.salva("Gabriel")
    println(nomesSalvos)
    println(BancoDenomes().nomes)
}

class BancoDenomes {

    val nomes: Collection<String> get() = dados.toList()

    fun salva(nome: String) {
        dados.add(nome)
    }

    companion object {
        private val dados = mutableListOf<String>()
    }
}

fun testaColecao() {
    val nomes: Collection<String> = mutableListOf(
        "Gabriel",
        "Roberta",
        "Ken",
        "Ryu",
        "Naruto",
        "Lelluch"
    )

    for (nome in nomes.iterator()) {
        println(nome)
    }
    println("Tem o nome Gabriel? ${nomes.contains("Gabriel")}")
    println("tamanho da coleção ${nomes.size}")
    println(nomes)
}