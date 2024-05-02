package br.gov.mpog.gestaoriscos.modelo;

import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Monitoramento.class)
public abstract class Monitoramento_ extends br.gov.mpog.gestaoriscos.modelo.EntidadeBase_ {

	public static volatile SingularAttribute<Monitoramento, Boolean> operadorInerente;
	public static volatile SingularAttribute<Monitoramento, Boolean> operadorResidual;
	public static volatile SingularAttribute<Monitoramento, Orgao> orgao;
	public static volatile SingularAttribute<Monitoramento, Boolean> operadorCategoria;
	public static volatile SingularAttribute<Monitoramento, Boolean> operadorConclusao;
	public static volatile SingularAttribute<Monitoramento, Calendar> dtCadastro;
	public static volatile SingularAttribute<Monitoramento, Boolean> operadorNivelRisco;
	public static volatile SingularAttribute<Monitoramento, Boolean> perfilNucleo;
	public static volatile ListAttribute<Monitoramento, Categoria> categorias;
	public static volatile SingularAttribute<Monitoramento, String> nome;
	public static volatile SingularAttribute<Monitoramento, Calendar> dtInicio;
	public static volatile SingularAttribute<Monitoramento, Calendar> dtFim;
	public static volatile SingularAttribute<Monitoramento, String> integridades;
	public static volatile SingularAttribute<Monitoramento, Boolean> operadorIntegridade;
	public static volatile ListAttribute<Monitoramento, MonitoramentoRisco> riscosResiduais;
	public static volatile SingularAttribute<Monitoramento, Boolean> operadorMacropocesso;
	public static volatile ListAttribute<Monitoramento, Macroprocesso> macroprocessos;
	public static volatile SingularAttribute<Monitoramento, String> niveisRisco;
	public static volatile ListAttribute<Monitoramento, MonitoramentoRisco> riscosInerentes;
	public static volatile SingularAttribute<Monitoramento, Long> id;
	public static volatile ListAttribute<Monitoramento, Orgao> secretarias;

}

