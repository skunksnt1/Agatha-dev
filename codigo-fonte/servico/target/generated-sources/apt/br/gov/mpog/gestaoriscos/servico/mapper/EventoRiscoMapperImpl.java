package br.gov.mpog.gestaoriscos.servico.mapper;

import br.gov.mpog.gestaoriscos.modelo.ControleEvento;

import br.gov.mpog.gestaoriscos.modelo.EventoCausa;

import br.gov.mpog.gestaoriscos.modelo.EventoConsequencia;

import br.gov.mpog.gestaoriscos.modelo.EventoRisco;

import br.gov.mpog.gestaoriscos.modelo.HistoricoEventoRisco;

import br.gov.mpog.gestaoriscos.modelo.PlanoControle;

import br.gov.mpog.gestaoriscos.modelo.dto.ControleEventoDTO;

import br.gov.mpog.gestaoriscos.modelo.dto.EventoCausaDTO;

import br.gov.mpog.gestaoriscos.modelo.dto.EventoConsequenciaDTO;

import br.gov.mpog.gestaoriscos.modelo.dto.EventoRiscoDTO;

import br.gov.mpog.gestaoriscos.modelo.dto.HistoricoEventoRiscoDTO;

import br.gov.mpog.gestaoriscos.modelo.dto.PlanoControleDTO;

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

public class EventoRiscoMapperImpl implements EventoRiscoMapper {

    @Autowired

    private IdentificacaoMapper identificacaoMapper;

    @Autowired

    private EventoMapper eventoMapper;

    @Autowired

    private CategoriaMapper categoriaMapper;

    @Autowired

    private EventoCausaMapper eventoCausaMapper;

    @Autowired

    private EventoConsequenciaMapper eventoConsequenciaMapper;

    @Autowired

    private ControleEventoMapper controleEventoMapper;

    @Autowired

    private CalculoRiscoMapper calculoRiscoMapper;

    @Autowired

    private PlanoControleMapper planoControleMapper;

    @Autowired

    private RespostaRiscoMapper respostaRiscoMapper;

    @Autowired

    private HistoricoEventoRiscoMapper historicoEventoRiscoMapper;

    @Override

    public EventoRiscoDTO eventoRiscoToEventoRiscoDTO(EventoRisco eventoRisco) {

        if ( eventoRisco == null ) {

            return null;
        }

        EventoRiscoDTO eventoRiscoDTO = new EventoRiscoDTO();

        eventoRiscoDTO.setId( eventoRisco.getId() );

        eventoRiscoDTO.setDtAtualizacao( eventoRisco.getDtAtualizacao() );

        eventoRiscoDTO.setExcluido( eventoRisco.isExcluido() );

        eventoRiscoDTO.setRiscoIntegridade( eventoRisco.getRiscoIntegridade() );

        eventoRiscoDTO.setIdentificacao( identificacaoMapper.identificacaoToIdentificacaoDTO( eventoRisco.getIdentificacao() ) );

        eventoRiscoDTO.setEvento( eventoMapper.eventoToEventoDTO( eventoRisco.getEvento() ) );

        eventoRiscoDTO.setCategoria( categoriaMapper.categoriaToCategoriaDTO( eventoRisco.getCategoria() ) );

        List<EventoCausaDTO> list = eventoCausaMapper.eventoCausasToEventoCausaDTOs( eventoRisco.getCausas() );

        if ( list != null ) {

            eventoRiscoDTO.setCausas( list );
        }

        List<EventoConsequenciaDTO> list_ = eventoConsequenciaMapper.eventoConsequenciasToEventoConsequenciaDTOs( eventoRisco.getConsequencias() );

        if ( list_ != null ) {

            eventoRiscoDTO.setConsequencias( list_ );
        }

        List<ControleEventoDTO> list__ = controleEventoMapper.controleEventosToControleEventoDTOs( eventoRisco.getControleEventos() );

        if ( list__ != null ) {

            eventoRiscoDTO.setControleEventos( list__ );
        }

        eventoRiscoDTO.setCalculoRiscoInerente( calculoRiscoMapper.calculoRiscoToCalculoRiscoDTO( eventoRisco.getCalculoRiscoInerente() ) );

        eventoRiscoDTO.setCalculoRiscoResidual( calculoRiscoMapper.calculoRiscoToCalculoRiscoDTO( eventoRisco.getCalculoRiscoResidual() ) );

        eventoRiscoDTO.setJustificativaRespostaRisco( eventoRisco.getJustificativaRespostaRisco() );

        eventoRiscoDTO.setRespostaRisco( respostaRiscoMapper.respostaRiscoToRespostaRiscoDTO( eventoRisco.getRespostaRisco() ) );

        List<PlanoControleDTO> list___ = planoControleMapper.planoControlesToPlanoControleDTOs( eventoRisco.getControles() );

        if ( list___ != null ) {

            eventoRiscoDTO.setControles( list___ );
        }

        List<HistoricoEventoRiscoDTO> list____ = historicoEventoRiscoMapper.toDto( eventoRisco.getHistorico() );

        if ( list____ != null ) {

            eventoRiscoDTO.setHistorico( list____ );
        }

        return eventoRiscoDTO;
    }

    @Override

    public List<EventoRiscoDTO> eventoRiscosToEventoRiscoDTOs(List<EventoRisco> eventoRiscos) {

        if ( eventoRiscos == null ) {

            return null;
        }

        List<EventoRiscoDTO> list = new ArrayList<EventoRiscoDTO>();

        for ( EventoRisco eventoRisco : eventoRiscos ) {

            list.add( eventoRiscoToEventoRiscoDTO( eventoRisco ) );
        }

        return list;
    }

    @Override

    public EventoRisco eventoRiscoDTOToEventoRisco(EventoRiscoDTO eventoRiscoDTO) {

        if ( eventoRiscoDTO == null ) {

            return null;
        }

        EventoRisco eventoRisco = new EventoRisco();

        eventoRisco.setExcluido( eventoRiscoDTO.isExcluido() );

        eventoRisco.setId( eventoRiscoDTO.getId() );

        eventoRisco.setDtAtualizacao( eventoRiscoDTO.getDtAtualizacao() );

        eventoRisco.setRiscoIntegridade( eventoRiscoDTO.getRiscoIntegridade() );

        eventoRisco.setIdentificacao( identificacaoMapper.identificacaoDTOToIdentificacao( eventoRiscoDTO.getIdentificacao() ) );

        eventoRisco.setEvento( eventoMapper.eventoDTOToEvento( eventoRiscoDTO.getEvento() ) );

        eventoRisco.setCategoria( categoriaMapper.categoriaDTOToCategoria( eventoRiscoDTO.getCategoria() ) );

        List<EventoCausa> list = eventoCausaMapper.eventoCausaDTOsToEventoCausas( eventoRiscoDTO.getCausas() );

        if ( list != null ) {

            eventoRisco.setCausas( list );
        }

        List<EventoConsequencia> list_ = eventoConsequenciaMapper.eventoConsequenciaDTOsToEventoConsequencias( eventoRiscoDTO.getConsequencias() );

        if ( list_ != null ) {

            eventoRisco.setConsequencias( list_ );
        }

        eventoRisco.setCalculoRiscoInerente( calculoRiscoMapper.calculoRiscoDTOToCalculoRisco( eventoRiscoDTO.getCalculoRiscoInerente() ) );

        eventoRisco.setCalculoRiscoResidual( calculoRiscoMapper.calculoRiscoDTOToCalculoRisco( eventoRiscoDTO.getCalculoRiscoResidual() ) );

        List<ControleEvento> list__ = controleEventoMapper.controleEventoDTOsToControleEventos( eventoRiscoDTO.getControleEventos() );

        if ( list__ != null ) {

            eventoRisco.setControleEventos( list__ );
        }

        eventoRisco.setJustificativaRespostaRisco( eventoRiscoDTO.getJustificativaRespostaRisco() );

        eventoRisco.setRespostaRisco( respostaRiscoMapper.respostaRiscoDTOToRespostaRisco( eventoRiscoDTO.getRespostaRisco() ) );

        List<PlanoControle> list___ = planoControleMapper.planoControleDTOsToPlanoControles( eventoRiscoDTO.getControles() );

        if ( list___ != null ) {

            eventoRisco.setControles( list___ );
        }

        List<HistoricoEventoRisco> list____ = historicoEventoRiscoMapper.toEntity( eventoRiscoDTO.getHistorico() );

        if ( list____ != null ) {

            eventoRisco.setHistorico( list____ );
        }

        return eventoRisco;
    }

    @Override

    public List<EventoRisco> eventoRiscoDTOsToEventoRiscos(List<EventoRiscoDTO> eventoRiscoDTOs) {

        if ( eventoRiscoDTOs == null ) {

            return null;
        }

        List<EventoRisco> list = new ArrayList<EventoRisco>();

        for ( EventoRiscoDTO eventoRiscoDTO : eventoRiscoDTOs ) {

            list.add( eventoRiscoDTOToEventoRisco( eventoRiscoDTO ) );
        }

        return list;
    }
}

