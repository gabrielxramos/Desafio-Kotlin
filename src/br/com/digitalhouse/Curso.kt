package br.com.digitalhouse

data class Curso(val nome: String? = null, val codCurso: Int? = null, val quantidadeMaxAln: Int? = null) {

    val listaDeMatriculados = mutableListOf<Aluno>()
    var profeTitular: ProfessorTitular? = null
    var profeAdjunto: ProfessorAdj? = null

    override fun equals(other: Any?): Boolean {
        return if (other is Curso) {
            other.codCurso == codCurso
        } else {
            true
        }
    }

    fun adicionarUmAluno(aluno: Aluno): Boolean {
        if (this.listaDeMatriculados.size < quantidadeMaxAln!!) {
            this.listaDeMatriculados.add(aluno)
            return true
        }
        return false
    }
    
    fun excluirAluno(umAluno: Aluno){
        if(listaDeMatriculados.contains(umAluno)){
            listaDeMatriculados.remove(umAluno)
        }
    }

}