package aula19;

import java.sql.ResultSet;

public class Service {
	public static void inserirAluno(Aluno a) {
		String query = String.format("INSERT INTO TB_ALUNO(ID_ALUNO, NM_ALUNO, NR_RA, NM_CURSO) VALUES(SQ_T_ALUNO.NEXTVAL, '%S','%S','%S')", a.getNome(), a.getRa(), a.getCurso());
	Dao.
	}
}
