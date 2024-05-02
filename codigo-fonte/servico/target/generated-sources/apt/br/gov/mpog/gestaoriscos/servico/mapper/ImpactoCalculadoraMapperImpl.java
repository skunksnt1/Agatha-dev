package br.gov.mpog.gestaoriscos.servico.mapper;

import br.gov.mpog.gestaoriscos.modelo.ImpactoCalculadora;

import br.gov.mpog.gestaoriscos.modelo.dto.ImpactoCalculadoraDTO;

import java.util.ArrayList;

import java.util.List;

import javax.annotation.Generated;

import org.springframework.stereotype.Component;

@Generated(

    value = "org.mapstruct.ap.MappingProcessor",

    date = "2022-04-14T10:22:21-0300",

    comments = "version: 1.1.0.Final, compiler: javac, environment: Java 1.8.0_171 (Oracle Corporation)"

)

@Component

public class ImpactoCalculadoraMapperImpl implements ImpactoCalculadoraMapper {

    @Override

    public ImpactoCalculadoraDTO impactoCalculadoraToImpactoCalculadoraDTO(ImpactoCalculadora impactoCalculadora) {

        if ( impactoCalculadora == null ) {

            return null;
        }

        ImpactoCalculadoraDTO impactoCalculadoraDTO = new ImpactoCalculadoraDTO();

        impactoCalculadoraDTO.setId( impactoCalculadora.getId() );

        impactoCalculadoraDTO.setExcluido( impactoCalculadora.isExcluido() );

        impactoCalculadoraDTO.setNome( impactoCalculadora.getNome() );

        impactoCalculadoraDTO.setPeso( impactoCalculadora.getPeso() );

        impactoCalculadoraDTO.setDesabilitado( impactoCalculadora.getDesabilitado() );

        return impactoCalculadoraDTO;
    }

    @Override

    public List<ImpactoCalculadoraDTO> impactoCalculadorasToImpactoCalculadoraDTOs(List<ImpactoCalculadora> impactoCalculadoras) {

        if ( impactoCalculadoras == null ) {

            return null;
        }

        List<ImpactoCalculadoraDTO> list = new ArrayList<ImpactoCalculadoraDTO>();

        for ( ImpactoCalculadora impactoCalculadora : impactoCalculadoras ) {

            list.add( impactoCalculadoraToImpactoCalculadoraDTO( impactoCalculadora ) );
        }

        return list;
    }

    @Override

    public ImpactoCalculadora impactoCalculadoraDTOToImpactoCalculadora(ImpactoCalculadoraDTO impactoCalculadoraDTO) {

        if ( impactoCalculadoraDTO == null ) {

            return null;
        }

        ImpactoCalculadora impactoCalculadora = new ImpactoCalculadora();

        impactoCalculadora.setExcluido( impactoCalculadoraDTO.isExcluido() );

        impactoCalculadora.setNome( impactoCalculadoraDTO.getNome() );

        impactoCalculadora.setId( impactoCalculadoraDTO.getId() );

        impactoCalculadora.setPeso( impactoCalculadoraDTO.getPeso() );

        impactoCalculadora.setDesabilitado( impactoCalculadoraDTO.getDesabilitado() );

        return impactoCalculadora;
    }

    @Override

    public List<ImpactoCalculadora> impactoCalculadoraDTOsToImpactoCalculadoras(List<ImpactoCalculadoraDTO> impactoCalculadoraDTOs) {

        if ( impactoCalculadoraDTOs == null ) {

            return null;
        }

        List<ImpactoCalculadora> list = new ArrayList<ImpactoCalculadora>();

        for ( ImpactoCalculadoraDTO impactoCalculadoraDTO : impactoCalculadoraDTOs ) {

            list.add( impactoCalculadoraDTOToImpactoCalculadora( impactoCalculadoraDTO ) );
        }

        return list;
    }
}

