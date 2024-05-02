package br.gov.mpog.gestaoriscos.servico.mapper;

import br.gov.mpog.gestaoriscos.modelo.Categoria;

import br.gov.mpog.gestaoriscos.modelo.Macroprocesso;

import br.gov.mpog.gestaoriscos.modelo.Monitoramento;

import br.gov.mpog.gestaoriscos.modelo.MonitoramentoRisco;

import br.gov.mpog.gestaoriscos.modelo.Orgao;

import br.gov.mpog.gestaoriscos.modelo.dto.CategoriaDTO;

import br.gov.mpog.gestaoriscos.modelo.dto.MacroprocessoDTO;

import br.gov.mpog.gestaoriscos.modelo.dto.MonitoramentoDTO;

import br.gov.mpog.gestaoriscos.modelo.dto.MonitoramentoRiscoDTO;

import br.gov.mpog.gestaoriscos.modelo.dto.OrgaoDTO;

import java.util.ArrayList;

import java.util.List;

import javax.annotation.Generated;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

@Generated(

    value = "org.mapstruct.ap.MappingProcessor",

    date = "2022-04-14T10:22:21-0300",

    comments = "version: 1.1.0.Final, compiler: javac, environment: Java 1.8.0_171 (Oracle Corporation)"

)

@Component

public class MonitoramentoMapperImpl implements MonitoramentoMapper {

    @Autowired

    private OrgaoMapper orgaoMapper;

    @Autowired

    private MacroprocessoMapper macroprocessoMapper;

    @Autowired

    private CategoriaMapper categoriaMapper;

    @Autowired

    private MonitoramentoRiscoMapper monitoramentoRiscoMapper;

    @Override

    public List<Monitoramento> toEntity(List<MonitoramentoDTO> dtoList) {

        if ( dtoList == null ) {

            return null;
        }

        List<Monitoramento> list = new ArrayList<Monitoramento>();

        for ( MonitoramentoDTO monitoramentoDTO : dtoList ) {

            list.add( toEntity( monitoramentoDTO ) );
        }

        return list;
    }

    @Override

    public List<MonitoramentoDTO> toDto(List<Monitoramento> entityList) {

        if ( entityList == null ) {

            return null;
        }

        List<MonitoramentoDTO> list = new ArrayList<MonitoramentoDTO>();

        for ( Monitoramento monitoramento : entityList ) {

            list.add( toDto( monitoramento ) );
        }

        return list;
    }

    @Override

    public Monitoramento toEntity(MonitoramentoDTO dto) {

        if ( dto == null ) {

            return null;
        }

        Monitoramento monitoramento_ = new Monitoramento();

        monitoramento_.setExcluido( dto.isExcluido() );

        monitoramento_.setId( dto.getId() );

        monitoramento_.setOrgao( orgaoMapper.orgaoDTOToOrgao( dto.getOrgao() ) );

        monitoramento_.setPerfilNucleo( dto.getPerfilNucleo() );

        monitoramento_.setNome( dto.getNome() );

        monitoramento_.setDtCadastro( dto.getDtCadastro() );

        monitoramento_.setOperadorMacropocesso( dto.getOperadorMacropocesso() );

        monitoramento_.setOperadorCategoria( dto.getOperadorCategoria() );

        monitoramento_.setOperadorIntegridade( dto.getOperadorIntegridade() );

        monitoramento_.setOperadorNivelRisco( dto.getOperadorNivelRisco() );

        monitoramento_.setOperadorResidual( dto.getOperadorResidual() );

        monitoramento_.setOperadorInerente( dto.getOperadorInerente() );

        monitoramento_.setOperadorConclusao( dto.getOperadorConclusao() );

        List<Orgao> list = orgaoMapper.orgaoDTOsToOrgaos( dto.getSecretarias() );

        if ( list != null ) {

            monitoramento_.setSecretarias( list );
        }

        List<Macroprocesso> list_ = macroprocessoMapper.toEntity( dto.getMacroprocessos() );

        if ( list_ != null ) {

            monitoramento_.setMacroprocessos( list_ );
        }

        List<Categoria> list__ = categoriaMapper.categoriaDTOsToCategorias( dto.getCategorias() );

        if ( list__ != null ) {

            monitoramento_.setCategorias( list__ );
        }

        List<MonitoramentoRisco> list___ = monitoramentoRiscoMapper.toEntity( dto.getRiscosResiduais() );

        if ( list___ != null ) {

            monitoramento_.setRiscosResiduais( list___ );
        }

        List<MonitoramentoRisco> list____ = monitoramentoRiscoMapper.toEntity( dto.getRiscosInerentes() );

        if ( list____ != null ) {

            monitoramento_.setRiscosInerentes( list____ );
        }

        monitoramento_.setDtInicio( dto.getDtInicio() );

        monitoramento_.setDtFim( dto.getDtFim() );

        monitoramento_.setNiveisRisco( String.join(",",dto.getNiveisRisco()) );

        monitoramento_.setIntegridades( String.join(",",dto.getIntegridades()) );

        return monitoramento_;
    }

    @Override

    public MonitoramentoDTO toDto(Monitoramento entity) {

        if ( entity == null ) {

            return null;
        }

        MonitoramentoDTO monitoramentoDTO_ = new MonitoramentoDTO();

        monitoramentoDTO_.setId( entity.getId() );

        monitoramentoDTO_.setExcluido( entity.isExcluido() );

        monitoramentoDTO_.setNome( entity.getNome() );

        monitoramentoDTO_.setOrgao( orgaoMapper.orgaoToOrgaoDTO( entity.getOrgao() ) );

        monitoramentoDTO_.setDtCadastro( entity.getDtCadastro() );

        monitoramentoDTO_.setPerfilNucleo( entity.getPerfilNucleo() );

        List<OrgaoDTO> list = orgaoMapper.orgaosToOrgaoDTOs( entity.getSecretarias() );

        if ( list != null ) {

            monitoramentoDTO_.setSecretarias( list );
        }

        monitoramentoDTO_.setOperadorMacropocesso( entity.getOperadorMacropocesso() );

        List<MacroprocessoDTO> list_ = macroprocessoMapper.toDto( entity.getMacroprocessos() );

        if ( list_ != null ) {

            monitoramentoDTO_.setMacroprocessos( list_ );
        }

        monitoramentoDTO_.setOperadorCategoria( entity.getOperadorCategoria() );

        List<CategoriaDTO> list__ = categoriaMapper.categoriasToCategoriaDTOs( entity.getCategorias() );

        if ( list__ != null ) {

            monitoramentoDTO_.setCategorias( list__ );
        }

        monitoramentoDTO_.setOperadorIntegridade( entity.getOperadorIntegridade() );

        monitoramentoDTO_.setOperadorNivelRisco( entity.getOperadorNivelRisco() );

        monitoramentoDTO_.setOperadorResidual( entity.getOperadorResidual() );

        List<MonitoramentoRiscoDTO> list___ = monitoramentoRiscoMapper.toDto( entity.getRiscosResiduais() );

        if ( list___ != null ) {

            monitoramentoDTO_.setRiscosResiduais( list___ );
        }

        monitoramentoDTO_.setOperadorInerente( entity.getOperadorInerente() );

        List<MonitoramentoRiscoDTO> list____ = monitoramentoRiscoMapper.toDto( entity.getRiscosInerentes() );

        if ( list____ != null ) {

            monitoramentoDTO_.setRiscosInerentes( list____ );
        }

        monitoramentoDTO_.setOperadorConclusao( entity.getOperadorConclusao() );

        monitoramentoDTO_.setDtInicio( entity.getDtInicio() );

        monitoramentoDTO_.setDtFim( entity.getDtFim() );

        monitoramentoDTO_.setNiveisRisco( java.util.Arrays.asList(entity.getNiveisRisco().split(",")) );

        monitoramentoDTO_.setIntegridades( java.util.Arrays.asList(entity.getIntegridades().split(",")) );

        return monitoramentoDTO_;
    }
}

