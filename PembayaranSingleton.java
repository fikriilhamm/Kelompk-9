/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pembayaran;

/**
 *
 * @author asus
 */
public class PembayaranSingleton {
    private String No_Pemesanan = null;
    private String Status_Pemesanan = null;
    private float Harga_Pemesanan ;
    private static PembayaranSingleton instance = null;
  
  private PembayaranSingleton (String No_Pemesanan) {
      this.No_Pemesanan = No_Pemesanan;
      this.Status_Pemesanan = Status_Pemesanan;
      this.Harga_Pemesanan = Harga_Pemesanan;
  }

  public void setNo_Pemesanan(String No_Pemesanan)
  {
      this.No_Pemesanan = No_Pemesanan;
  }
  
  public void setStatus_Pemesanan(String Status_Pemesanan)
  {
      this.Status_Pemesanan = Status_Pemesanan;
  }
  
  public void setHarga_Pemesanan(float Harga_Pemesanan)
  {
      this.Harga_Pemesanan = Harga_Pemesanan;
  }
  
  public String getNo_Pemesanan()
  {
      return this.No_Pemesanan;
  }
  
  public String getStatus_Pemesanan()
  {
      return this.Status_Pemesanan;
  }
  
  public float getHarga_Pemesanan()
  {
      return this.Harga_Pemesanan;
  }
  
  public static PembayaranSingleton getInstance(String inputNo_Pemesanan, String inputStatus_Pemesanan, float inputHarga_Pemesanan)
  {
    if (instance == null) 
    {
      instance = new PembayaranSingleton(inputNo_Pemesanan);
    } else
    {
      instance = new PembayaranSingleton(inputStatus_Pemesanan);
    }
    return instance;
  }
}