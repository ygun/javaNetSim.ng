package core;


/**
* core/WANCorbaOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from WANCorba.idl
* 8 ������ 2007 �. 21:54:08 MSK
*/

public interface WANCorbaOperations 
{
  void receivePacket (String inPacket);
  void setServiceName (String inService);
  void shutdown ();
} // interface WANCorbaOperations