data class infoJogo(val info:InfoApiShark) { // pegando  o valor da chave do json e o nalor do jogo
    override fun toString(): String {
        return info.toString() // onvertendo para string
    }
}