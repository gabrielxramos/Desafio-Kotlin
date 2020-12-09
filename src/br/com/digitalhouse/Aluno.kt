package br.com.digitalhouse

data class Aluno(val nome: String? = null, val sobreNome: String? = null, val codAluno: Int? = null) {

    override fun equals(aluno: Any?): Boolean {
        aluno as Aluno
        return this.codAluno == aluno.codAluno
    }
}