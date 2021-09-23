package util;

import controller.ControllerProdutos;
import controller.ControllerVendas;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.JobName;
import javax.print.attribute.standard.MediaSizeName;
import javax.print.attribute.standard.OrientationRequested;
import javax.swing.JOptionPane;
import model.ModelVendas;
import model.ModelVendasProdutos;

/**
 * @author Thiago
 */

public class ImprimirPDV {
    
    public void GerarCupom (int pCodigo) throws IOException{
       ControllerProdutos controllerProdutos = new ControllerProdutos();
       ControllerVendas controllerVendas = new ControllerVendas();
       ArrayList<ModelVendasProdutos> listaModelVendasProdutos = new ArrayList<>();
    }
}
