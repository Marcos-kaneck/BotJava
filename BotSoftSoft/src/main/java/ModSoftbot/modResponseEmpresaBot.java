/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModSoftbot;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

/**
 *
 * @author User
 */
public class modResponseEmpresaBot extends modResponseMen {

    static String quebra = " " + Keys.SHIFT + Keys.ENTER + Keys.SHIFT;
    private String valorVha;
    private String messageOp;
    private WebElement mesageUsu;

    private WebElement menUs;
    private String valorMenUS;

    private String message_Contabilidade;
    private WebElement web_ContabilidadeMen;
    private WebElement numeroNota;
    private String valorNota;

    private String mesage_RH;
    private WebElement mesage_WebRH;
    private String verificarCurriculo;
    private WebElement curriculo;

    private String mesageTransporte;
    private WebElement transporte_Web;
    private String notaTransporte;
    private WebElement notaWebTransporte;

    private String mesage_Fin;
    private WebElement web_Fin;
    private String fin_Hp;
    private WebElement financeiro_HP;

    public String getValorVha() {
        return valorVha;
    }

    public void setValorVha(String valorVha) {
        this.valorVha = valorVha;
    }

    public String getMessageOp() {
        return messageOp;
    }

    public void setMessageOp(String messageOp) {
        this.messageOp = messageOp;
    }

    public WebElement getMesageUsu() {
        return mesageUsu;
    }

    public void setMesageUsu(WebElement mesageUsu) {
        this.mesageUsu = mesageUsu;
    }

    public WebElement getMenUs() {
        return menUs;
    }

    public void setMenUs(WebElement menUs) {
        this.menUs = menUs;
    }

    public String getValorMenUS() {
        return valorMenUS;
    }

    public void setValorMenUS(String valorMenUS) {
        this.valorMenUS = valorMenUS;
    }

    public String getMessage_Contabilidade() {
        return message_Contabilidade;
    }

    public void setMessage_Contabilidade(String message_Contabilidade) {
        this.message_Contabilidade = message_Contabilidade;
    }

    public WebElement getWeb_ContabilidadeMen() {
        return web_ContabilidadeMen;
    }

    public void setWeb_ContabilidadeMen(WebElement web_ContabilidadeMen) {
        this.web_ContabilidadeMen = web_ContabilidadeMen;
    }

    public WebElement getNumeroNota() {
        return numeroNota;
    }

    public void setNumeroNota(WebElement numeroNota) {
        this.numeroNota = numeroNota;
    }

    public String getValorNota() {
        return valorNota;
    }

    public void setValorNota(String valorNota) {
        this.valorNota = valorNota;
    }

    public String getMesage_RH() {
        return mesage_RH;
    }

    public void setMesage_RH(String mesage_RH) {
        this.mesage_RH = mesage_RH;
    }

    public WebElement getMesage_WebRH() {
        return mesage_WebRH;
    }

    public void setMesage_WebRH(WebElement mesage_WebRH) {
        this.mesage_WebRH = mesage_WebRH;
    }

    public String getVerificarCurriculo() {
        return verificarCurriculo;
    }

    public void setVerificarCurriculo(String verificarCurriculo) {
        this.verificarCurriculo = verificarCurriculo;
    }

    public WebElement getCurriculo() {
        return curriculo;
    }

    public void setCurriculo(WebElement curriculo) {
        this.curriculo = curriculo;
    }

    public String getMesageTransporte() {
        return mesageTransporte;
    }

    public void setMesageTransporte(String mesageTransporte) {
        this.mesageTransporte = mesageTransporte;
    }

    public WebElement getTransporte_Web() {
        return transporte_Web;
    }

    public void setTransporte_Web(WebElement transporte_Web) {
        this.transporte_Web = transporte_Web;
    }

    public String getNotaTransporte() {
        return notaTransporte;
    }

    public void setNotaTransporte(String notaTransporte) {
        this.notaTransporte = notaTransporte;
    }

    public WebElement getNotaWebTransporte() {
        return notaWebTransporte;
    }

    public void setNotaWebTransporte(WebElement notaWebTransporte) {
        this.notaWebTransporte = notaWebTransporte;
    }

    public String getMesage_Fin() {
        return mesage_Fin;
    }

    public void setMesage_Fin(String mesage_Fin) {
        this.mesage_Fin = mesage_Fin;
    }

    public WebElement getWeb_Fin() {
        return web_Fin;
    }

    public void setWeb_Fin(WebElement web_Fin) {
        this.web_Fin = web_Fin;
    }

    public String getFin_Hp() {
        return fin_Hp;
    }

    public void setFin_Hp(String fin_Hp) {
        this.fin_Hp = fin_Hp;
    }

    public WebElement getFinanceiro_HP() {
        return financeiro_HP;
    }

    public void setFinanceiro_HP(WebElement financeiro_HP) {
        this.financeiro_HP = financeiro_HP;
    }

    public void responseEmpresaMod() throws InterruptedException {

        this.valorVha = "SEJA BEM VINDO AO ATENDIMENTO VIRTUAL DA EMPRESA HIPERHAUS"
                + quebra + "Com qual departamento voce deseja contactar?"
                + quebra + "para estar te redirecionando a um setor informe um valor que corresponda a seu setor"
                + quebra + "1 Contabilidade"
                + quebra + "2 Departamento Pessoal"
                + quebra + "3 Transporte"
                + quebra + "4 Almoxarifado"
                + quebra + "5 Recepção";

        driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[1]/div/div[1]/p")).sendKeys(this.valorVha, Keys.ENTER);
        Thread.sleep(Duration.ofSeconds(2));

        this.mesageUsu = driver.findElement(By.cssSelector("#main > div._2gzeB > div > div._5kRIK > div.n5hs2j7m.oq31bsqd.gx1rr48f.qh5tioqs > div:nth-child(21) > div > div > div.ItfyB._3nbHh > div._27K43 > div.copyable-text > div > span._11JPr.selectable-text.copyable-text > span"));
        this.valorVha = this.mesageUsu.getText();

        switch (this.valorVha) {
            case "1" -> {

                driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[1]/div/div[1]/p")).sendKeys(
                        "Bem Vindo A Contabilidade" + quebra + "Oque Deseja" + quebra
                        + "1 Verificar nota" + quebra + "2 Falar Com Responsavel Pelo Setor", Keys.ENTER);

                this.numeroNota = driver.findElement(By.cssSelector("#main > div._2gzeB > div > div._5kRIK > div.n5hs2j7m.oq31bsqd.gx1rr48f.qh5tioqs > div:nth-child(21) > div > div > div.ItfyB._3nbHh > div._27K43 > div.copyable-text > div > span._11JPr.selectable-text.copyable-text > span"));
                this.valorNota = this.numeroNota.getText();

                switch (this.valorNota) {
                    case "1" -> {

                        driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[1]/div/div[1]/p")).sendKeys("Informe o numero da sua nota", Keys.ENTER);
                        this.numeroNota = driver.findElement(By.cssSelector("#main > div._2gzeB > div > div._33LGR > div.n5hs2j7m.oq31bsqd.gx1rr48f.qh5tioqs > div:nth-child(19) > div > div > div.ItfyB._3nbHh > div._22Msk > div.copyable-text > div > span.i0jNr.selectable-text.copyable-text > span"));
                        this.valorNota = this.numeroNota.getText();
                        
                        //adiciona valor banco
                        if (1 == 1) {

                        }
                    }
                    case "2" -> {
                        driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[1]/div/div[1]/p")).sendKeys("Em instates o Responsavel entrara em contato", Keys.ENTER);

                    }
                    default -> {
                        driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[1]/div/div[1]/p")).sendKeys("Me Desculpe Não Consigo te Compreender Informe um Valor Valido!", Keys.ENTER);
                    }
                }
            }
            case "2" -> {

                driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[1]/div/div[1]/p")).sendKeys(
                        "Bem Vindo Ao Departamento Pessoal" + quebra + "Oque Deseja" + quebra
                        + "1 Verificar Situação do Curriculo" + quebra + "2 Falar Com Responsavel Pelo Setor"
                        + "3 Enviar Curriculo", Keys.ENTER);

                this.mesage_WebRH = driver.findElement(By.cssSelector("#main > div._2gzeB > div > div._5kRIK > div.n5hs2j7m.oq31bsqd.gx1rr48f.qh5tioqs > div:nth-child(21) > div > div > div.ItfyB._3nbHh > div._27K43 > div.copyable-text > div > span._11JPr.selectable-text.copyable-text > span"));
                this.mesage_RH = this.mesage_WebRH.getText();

                switch (this.mesage_RH) {

                    case "1" -> {
                        driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[1]/div/div[1]/p")).sendKeys("Informe o numero do seu curriculo", Keys.ENTER);
                        this.curriculo = driver.findElement(By.cssSelector("#main > div._2gzeB > div > div._5kRIK > div.n5hs2j7m.oq31bsqd.gx1rr48f.qh5tioqs > div:nth-child(21) > div > div > div.ItfyB._3nbHh > div._27K43 > div.copyable-text > div > span._11JPr.selectable-text.copyable-text > span"));
                        this.mesage_RH = this.curriculo.getText();
                        
                        //banco
                        if (1 == 2) {

                        }
                    }
                }
            }
            case "3" -> {

                driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[1]/div/div[1]/p")).sendKeys(
                        "Bem Vindo Ao Fincanceiro" + quebra + "Oque Deseja" + quebra
                        + "1 Verificar nota" + quebra + "2 Falar Com Responsavel Pelo Setor", Keys.ENTER);

                this.financeiro_HP = driver.findElement(By.cssSelector("#main > div._2gzeB > div > div._5kRIK > div.n5hs2j7m.oq31bsqd.gx1rr48f.qh5tioqs > div:nth-child(21) > div > div > div.ItfyB._3nbHh > div._27K43 > div.copyable-text > div > span._11JPr.selectable-text.copyable-text > span"));
                this.fin_Hp = this.financeiro_HP.getText();

                switch (this.fin_Hp) {

                    case "1" -> {

                        driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[1]/div/div[1]/p")).sendKeys("Informe o numero da sua nota", Keys.ENTER);

                        this.web_Fin = driver.findElement(By.cssSelector("#main > div._2gzeB > div > div._5kRIK > div.n5hs2j7m.oq31bsqd.gx1rr48f.qh5tioqs > div:nth-child(21) > div > div > div.ItfyB._3nbHh > div._27K43 > div.copyable-text > div > span._11JPr.selectable-text.copyable-text > span"));
                        this.mesage_Fin = this.web_Fin.getText();
                        
                        //banco
                        if (1 == 1) {

                        }
                    }
                }
            }
            default -> {
                driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[1]/div/div[1]/p")).sendKeys("Me Desculpe Não Consigo te Compreender Informe um Valor Valido!", Keys.ENTER);
            }
        }
    }
}
