
package br.com.senior.services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "sapiens_Syncnutriplan_op", targetNamespace = "http://services.senior.com.br")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SapiensSyncnutriplanOp {


    /**
     * 
     * @param password
     * @param encryption
     * @param user
     * @param parameters
     * @return
     *     returns br.com.senior.services.OpPrioridadeCentroDeRecursoOut
     */
    @WebMethod(operationName = "PrioridadeCentroDeRecurso")
    @WebResult(name = "result", partName = "result")
    @Action(input = "http://services.senior.com.br/sapiens_Syncnutriplan_op/PrioridadeCentroDeRecursoRequest", output = "http://services.senior.com.br/sapiens_Syncnutriplan_op/PrioridadeCentroDeRecursoResponse")
    public OpPrioridadeCentroDeRecursoOut prioridadeCentroDeRecurso(
        @WebParam(name = "user", partName = "user")
        String user,
        @WebParam(name = "password", partName = "password")
        String password,
        @WebParam(name = "encryption", partName = "encryption")
        int encryption,
        @WebParam(name = "parameters", partName = "parameters")
        OpPrioridadeCentroDeRecursoIn parameters);

    /**
     * 
     * @param password
     * @param encryption
     * @param user
     * @param parameters
     * @return
     *     returns br.com.senior.services.OpTurnoDeTrabalhoXHorariosOut
     */
    @WebMethod(operationName = "TurnoDeTrabalho_x_Horarios")
    @WebResult(name = "result", partName = "result")
    @Action(input = "http://services.senior.com.br/sapiens_Syncnutriplan_op/TurnoDeTrabalho_x_HorariosRequest", output = "http://services.senior.com.br/sapiens_Syncnutriplan_op/TurnoDeTrabalho_x_HorariosResponse")
    public OpTurnoDeTrabalhoXHorariosOut turnoDeTrabalhoXHorarios(
        @WebParam(name = "user", partName = "user")
        String user,
        @WebParam(name = "password", partName = "password")
        String password,
        @WebParam(name = "encryption", partName = "encryption")
        int encryption,
        @WebParam(name = "parameters", partName = "parameters")
        OpTurnoDeTrabalhoXHorariosIn parameters);

    /**
     * 
     * @param password
     * @param encryption
     * @param user
     * @param parameters
     * @return
     *     returns br.com.senior.services.OpCentroDeRecursoOut
     */
    @WebMethod(operationName = "CentroDeRecurso")
    @WebResult(name = "result", partName = "result")
    @Action(input = "http://services.senior.com.br/sapiens_Syncnutriplan_op/CentroDeRecursoRequest", output = "http://services.senior.com.br/sapiens_Syncnutriplan_op/CentroDeRecursoResponse")
    public OpCentroDeRecursoOut centroDeRecurso(
        @WebParam(name = "user", partName = "user")
        String user,
        @WebParam(name = "password", partName = "password")
        String password,
        @WebParam(name = "encryption", partName = "encryption")
        int encryption,
        @WebParam(name = "parameters", partName = "parameters")
        OpCentroDeRecursoIn parameters);

    /**
     * 
     * @param password
     * @param encryption
     * @param user
     * @param parameters
     * @return
     *     returns br.com.senior.services.OpListaExportadoOut
     */
    @WebMethod(operationName = "ListaExportado")
    @WebResult(name = "result", partName = "result")
    @Action(input = "http://services.senior.com.br/sapiens_Syncnutriplan_op/ListaExportadoRequest", output = "http://services.senior.com.br/sapiens_Syncnutriplan_op/ListaExportadoResponse")
    public OpListaExportadoOut listaExportado(
        @WebParam(name = "user", partName = "user")
        String user,
        @WebParam(name = "password", partName = "password")
        String password,
        @WebParam(name = "encryption", partName = "encryption")
        int encryption,
        @WebParam(name = "parameters", partName = "parameters")
        OpListaExportadoIn parameters);

    /**
     * 
     * @param password
     * @param encryption
     * @param user
     * @param parameters
     * @return
     *     returns br.com.senior.services.OpDefeitoFabricacaoOut
     */
    @WebMethod(operationName = "DefeitoFabricacao")
    @WebResult(name = "result", partName = "result")
    @Action(input = "http://services.senior.com.br/sapiens_Syncnutriplan_op/DefeitoFabricacaoRequest", output = "http://services.senior.com.br/sapiens_Syncnutriplan_op/DefeitoFabricacaoResponse")
    public OpDefeitoFabricacaoOut defeitoFabricacao(
        @WebParam(name = "user", partName = "user")
        String user,
        @WebParam(name = "password", partName = "password")
        String password,
        @WebParam(name = "encryption", partName = "encryption")
        int encryption,
        @WebParam(name = "parameters", partName = "parameters")
        OpDefeitoFabricacaoIn parameters);

    /**
     * 
     * @param password
     * @param encryption
     * @param user
     * @param parameters
     * @return
     *     returns br.com.senior.services.OpApontamentoProducaoOut
     */
    @WebMethod(operationName = "ApontamentoProducao")
    @WebResult(name = "result", partName = "result")
    @Action(input = "http://services.senior.com.br/sapiens_Syncnutriplan_op/ApontamentoProducaoRequest", output = "http://services.senior.com.br/sapiens_Syncnutriplan_op/ApontamentoProducaoResponse")
    public OpApontamentoProducaoOut apontamentoProducao(
        @WebParam(name = "user", partName = "user")
        String user,
        @WebParam(name = "password", partName = "password")
        String password,
        @WebParam(name = "encryption", partName = "encryption")
        int encryption,
        @WebParam(name = "parameters", partName = "parameters")
        OpApontamentoProducaoIn parameters);

    /**
     * 
     * @param password
     * @param encryption
     * @param user
     * @param parameters
     * @return
     *     returns br.com.senior.services.OpApontamentoParadaOut
     */
    @WebMethod(operationName = "ApontamentoParada")
    @WebResult(name = "result", partName = "result")
    @Action(input = "http://services.senior.com.br/sapiens_Syncnutriplan_op/ApontamentoParadaRequest", output = "http://services.senior.com.br/sapiens_Syncnutriplan_op/ApontamentoParadaResponse")
    public OpApontamentoParadaOut apontamentoParada(
        @WebParam(name = "user", partName = "user")
        String user,
        @WebParam(name = "password", partName = "password")
        String password,
        @WebParam(name = "encryption", partName = "encryption")
        int encryption,
        @WebParam(name = "parameters", partName = "parameters")
        OpApontamentoParadaIn parameters);

    /**
     * 
     * @param password
     * @param encryption
     * @param user
     * @param parameters
     * @return
     *     returns br.com.senior.services.OpEmpresaOPOut
     */
    @WebMethod(operationName = "EmpresaOP")
    @WebResult(name = "result", partName = "result")
    @Action(input = "http://services.senior.com.br/sapiens_Syncnutriplan_op/EmpresaOPRequest", output = "http://services.senior.com.br/sapiens_Syncnutriplan_op/EmpresaOPResponse")
    public OpEmpresaOPOut empresaOP(
        @WebParam(name = "user", partName = "user")
        String user,
        @WebParam(name = "password", partName = "password")
        String password,
        @WebParam(name = "encryption", partName = "encryption")
        int encryption,
        @WebParam(name = "parameters", partName = "parameters")
        OpEmpresaOPIn parameters);

    /**
     * 
     * @param password
     * @param encryption
     * @param user
     * @param parameters
     * @return
     *     returns br.com.senior.services.OpOperadorOut
     */
    @WebMethod(operationName = "Operador")
    @WebResult(name = "result", partName = "result")
    @Action(input = "http://services.senior.com.br/sapiens_Syncnutriplan_op/OperadorRequest", output = "http://services.senior.com.br/sapiens_Syncnutriplan_op/OperadorResponse")
    public OpOperadorOut operador(
        @WebParam(name = "user", partName = "user")
        String user,
        @WebParam(name = "password", partName = "password")
        String password,
        @WebParam(name = "encryption", partName = "encryption")
        int encryption,
        @WebParam(name = "parameters", partName = "parameters")
        OpOperadorIn parameters);

    /**
     * 
     * @param password
     * @param encryption
     * @param user
     * @param parameters
     * @return
     *     returns br.com.senior.services.OpUsuarioOut
     */
    @WebMethod(operationName = "Usuario")
    @WebResult(name = "result", partName = "result")
    @Action(input = "http://services.senior.com.br/sapiens_Syncnutriplan_op/UsuarioRequest", output = "http://services.senior.com.br/sapiens_Syncnutriplan_op/UsuarioResponse")
    public OpUsuarioOut usuario(
        @WebParam(name = "user", partName = "user")
        String user,
        @WebParam(name = "password", partName = "password")
        String password,
        @WebParam(name = "encryption", partName = "encryption")
        int encryption,
        @WebParam(name = "parameters", partName = "parameters")
        OpUsuarioIn parameters);

    /**
     * 
     * @param password
     * @param encryption
     * @param user
     * @param parameters
     * @return
     *     returns br.com.senior.services.OpListaTurnoOut
     */
    @WebMethod(operationName = "ListaTurno")
    @WebResult(name = "result", partName = "result")
    @Action(input = "http://services.senior.com.br/sapiens_Syncnutriplan_op/ListaTurnoRequest", output = "http://services.senior.com.br/sapiens_Syncnutriplan_op/ListaTurnoResponse")
    public OpListaTurnoOut listaTurno(
        @WebParam(name = "user", partName = "user")
        String user,
        @WebParam(name = "password", partName = "password")
        String password,
        @WebParam(name = "encryption", partName = "encryption")
        int encryption,
        @WebParam(name = "parameters", partName = "parameters")
        OpListaTurnoIn parameters);

    /**
     * 
     * @param password
     * @param encryption
     * @param user
     * @param parameters
     * @return
     *     returns br.com.senior.services.OpMotivoParadaOut
     */
    @WebMethod(operationName = "MotivoParada")
    @WebResult(name = "result", partName = "result")
    @Action(input = "http://services.senior.com.br/sapiens_Syncnutriplan_op/MotivoParadaRequest", output = "http://services.senior.com.br/sapiens_Syncnutriplan_op/MotivoParadaResponse")
    public OpMotivoParadaOut motivoParada(
        @WebParam(name = "user", partName = "user")
        String user,
        @WebParam(name = "password", partName = "password")
        String password,
        @WebParam(name = "encryption", partName = "encryption")
        int encryption,
        @WebParam(name = "parameters", partName = "parameters")
        OpMotivoParadaIn parameters);

    /**
     * 
     * @param password
     * @param encryption
     * @param user
     * @param parameters
     * @return
     *     returns br.com.senior.services.OpOrdemProducaoOut
     */
    @WebMethod(operationName = "OrdemProducao")
    @WebResult(name = "result", partName = "result")
    @Action(input = "http://services.senior.com.br/sapiens_Syncnutriplan_op/OrdemProducaoRequest", output = "http://services.senior.com.br/sapiens_Syncnutriplan_op/OrdemProducaoResponse")
    public OpOrdemProducaoOut ordemProducao(
        @WebParam(name = "user", partName = "user")
        String user,
        @WebParam(name = "password", partName = "password")
        String password,
        @WebParam(name = "encryption", partName = "encryption")
        int encryption,
        @WebParam(name = "parameters", partName = "parameters")
        OpOrdemProducaoIn parameters);

    /**
     * 
     * @param password
     * @param encryption
     * @param user
     * @param parameters
     * @return
     *     returns br.com.senior.services.OpFichaTecnicaOut
     */
    @WebMethod(operationName = "FichaTecnica")
    @WebResult(name = "result", partName = "result")
    @Action(input = "http://services.senior.com.br/sapiens_Syncnutriplan_op/FichaTecnicaRequest", output = "http://services.senior.com.br/sapiens_Syncnutriplan_op/FichaTecnicaResponse")
    public OpFichaTecnicaOut fichaTecnica(
        @WebParam(name = "user", partName = "user")
        String user,
        @WebParam(name = "password", partName = "password")
        String password,
        @WebParam(name = "encryption", partName = "encryption")
        int encryption,
        @WebParam(name = "parameters", partName = "parameters")
        OpFichaTecnicaIn parameters);

}
