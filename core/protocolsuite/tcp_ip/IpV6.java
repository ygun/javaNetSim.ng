/*
Java Firewall Simulator (jFirewallSim)

Copyright (c) 2004, jFirewallSim development team All rights reserved.

Redistribution and use in source and binary forms, with or without modification, are
permitted provided that the following conditions are met:

	- Redistributions of source code must retain the above copyright notice, this list
	  of conditions and the following disclaimer.
	- Redistributions in binary form must reproduce the above copyright notice, this list
	  of conditions and the following disclaimer in the documentation and/or other
	  materials provided with the distribution.
	- Neither the name of the Canberra Institute of Technology nor the names of its
	  contributors may be used to endorse or promote products derived from this software
	  without specific prior written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY
EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL
THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR
TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE,
EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/


package core.protocolsuite.tcp_ip;

/**
 * This is for design and future implementation of IPV6.
 * @author luke_hamilton
 * @since Sep 17, 2004
 * @version v0.20
 */


public class IpV6 extends Ip {

	
	/**
	 * Checks to see if the IP address is local.
	 * Return false at all times
	 * @author bevan_calliess
	 * @author angela_brown
	 * @param ipAddress - IP address of node eg: 192.168.0.2
	 * @return boolean
	 */
	public boolean isLocal(String ipAddress){
			return false;}	
			
	/**
	 * 
	 */
	@Override
	public void setIPAddress(String interfaceKey, String inIPAddress){
		
	}
	/**
	 * 
	 */
	@Override
	public String getIPAddress(String inInterfaceKey){
		return "";
	}
	
	/**
	 * 
	 */
	@Override
	public String getDefaultGateway(){
		return "";
	}
	/**
	 * 
	 */
	@Override
	public void setDefaultGateway(String inGatewayAddress){
		
	}
	/**
	 * 
	 */
	@Override
	public boolean isInternalIP(String inIPAddress){
		return false;
	}
}//EOF
