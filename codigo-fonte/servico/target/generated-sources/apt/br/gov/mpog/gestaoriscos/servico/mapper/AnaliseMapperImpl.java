package br.gov.mpog.gestaoriscos.servico.mapper;

import br.gov.mpog.gestaoriscos.modelo.Analise;

import br.gov.mpog.gestaoriscos.modelo.MatrizSwot;

import br.gov.mpog.gestaoriscos.modelo.dto.AnaliseDTO;

import br.gov.mpog.gestaoriscos.modelo.dto.MatrizSwotDTO;

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

public class AnaliseMapperImpl implements AnaliseMapper {

    @Autowired

    private MatrizSwotMapper matrizSwotMapper;

    @Autowired

    private OrgaoMapper orgaoMapper;

    @Override

    public AnaliseDTO analiseToAnaliseDTO(Analise analise) {

        if ( analise == null ) {

            return null;
        }

        AnaliseDTO analiseDTO = new AnaliseDTO();

        analiseDTO.setExcluido( analise.isExcluido() );

        analiseDTO.setId( analise.getId() );

        analiseDTO.setEtica( analise.getEtica() );

        analiseDTO.setEstrutura( analise.getEstrutura() );

        analiseDTO.setRecursosHumanos( analise.getRecursosHumanos() );

        analiseDTO.setAtribuicoes( analise.getAtribuicoes() );

        analiseDTO.setNormasInternas( analise.getNormasInternas() );

        analiseDTO.setMissao( analise.getMissao() );

        analiseDTO.setVisao( analise.getVisao() );

        analiseDTO.setObjetivos( analise.getObjetivos() );

        analiseDTO.setOrgao( orgaoMapper.orgaoToOrgaoDTO( analise.getOrgao() ) );

        analiseDTO.setSecretaria( orgaoMapper.orgaoToOrgaoDTO( analise.getSecretaria() ) );

        List<MatrizSwotDTO> list = matrizSwotMapper.matrizSwotsToMatrizSwotDTOs( analise.getMatrizes() );

        if ( list != null ) {

            analiseDTO.setMatrizes( list );
        }

        return analiseDTO;
    }

    @Override

    public List<AnaliseDTO> analisesToAnaliseDTOs(List<Analise> analises) {

        if ( analises == null ) {

            return null;
        }

        List<AnaliseDTO> list = new ArrayList<AnaliseDTO>();

        for ( Analise analise : analises ) {

            list.add( analiseToAnaliseDTO( analise ) );
        }

        return list;
    }

    @Override

    public Analise analiseDTOToAnalise(AnaliseDTO analiseDTO) {

        if ( analiseDTO == null ) {

            return null;
        }

        Analise analise = new Analise();

        analise.setExcluido( analiseDTO.isExcluido() );

        analise.setId( analiseDTO.getId() );

        analise.setEtica( analiseDTO.getEtica() );

        analise.setEstrutura( analiseDTO.getEstrutura() );

        analise.setRecursosHumanos( analiseDTO.getRecursosHumanos() );

        analise.setAtribuicoes( analiseDTO.getAtribuicoes() );

        analise.setNormasInternas( analiseDTO.getNormasInternas() );

        analise.setMissao( analiseDTO.getMissao() );

        analise.setVisao( analiseDTO.getVisao() );

        analise.setObjetivos( analiseDTO.getObjetivos() );

        analise.setOrgao( orgaoMapper.orgaoDTOToOrgao( analiseDTO.getOrgao() ) );

        analise.setSecretaria( orgaoMapper.orgaoDTOToOrgao( analiseDTO.getSecretaria() ) );

        List<MatrizSwot> list = matrizSwotMapper.matrizSwotDTOsToMatrizSwots( analiseDTO.getMatrizes() );

        if ( list != null ) {

            analise.setMatrizes( list );
        }

        return analise;
    }

    @Override

    public List<Analise> analiseDTOsToAnalises(List<AnaliseDTO> analiseDTOs) {

        if ( analiseDTOs == null ) {

            return null;
        }

        List<Analise> list = new ArrayList<Analise>();

        for ( AnaliseDTO analiseDTO : analiseDTOs ) {

            list.add( analiseDTOToAnalise( analiseDTO ) );
        }

        return list;
    }
}

