package br.gov.mpog.gestaoriscos.modelo.base;

import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ProcessoBase.class)
public abstract class ProcessoBase_ extends br.gov.mpog.gestaoriscos.modelo.EntidadeBase_ {

	public static volatile SingularAttribute<ProcessoBase, String> sistema;
	public static volatile SingularAttribute<ProcessoBase, Calendar> dtCadastro;
	public static volatile SingularAttribute<ProcessoBase, Calendar> dtInicio;
	public static volatile SingularAttribute<ProcessoBase, Calendar> dtFim;
	public static volatile SingularAttribute<ProcessoBase, String> objetivo;
	public static volatile SingularAttribute<ProcessoBase, String> coordenacao;
	public static volatile SingularAttribute<ProcessoBase, String> lei;
	public static volatile SingularAttribute<ProcessoBase, String> search;
	public static volatile SingularAttribute<ProcessoBase, Calendar> dtValidacao;
	public static volatile SingularAttribute<ProcessoBase, String> processo;
	public static volatile SingularAttribute<ProcessoBase, String> justificativa;
	public static volatile SingularAttribute<ProcessoBase, String> diretoria;
	public static volatile SingularAttribute<ProcessoBase, Long> id;

}

