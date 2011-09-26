package nimmo.template.hazelcast;

import com.hazelcast.core.Cluster;
import com.hazelcast.core.InstanceEvent;
import com.hazelcast.core.InstanceListener;
import com.hazelcast.core.Member;
import com.hazelcast.core.MembershipEvent;
import com.hazelcast.core.MembershipListener;

public class ClusterInformation extends AbstractClientExamples implements InstanceListener, MembershipListener {
	
	public static void main(String[] args) {
		ClusterInformation ci = new ClusterInformation();
		ci.printClusterInformation();
	}
	
	public void printClusterInformation(){
		getHazelcastClient().addInstanceListener(this);
		getHazelcastClient().getCluster().addMembershipListener(this);
		Cluster c = getHazelcastClient().getCluster();
		for (Member member : c.getMembers()) {
			System.out.println(member);
		}
	}

	public void instanceCreated(InstanceEvent instanceEvent) {
		System.out.println(instanceEvent);
	}

	public void instanceDestroyed(InstanceEvent instanceEvent) {
		System.out.println(instanceEvent);
	}

	public void memberAdded(MembershipEvent membershipEvent) {
		System.out.println(membershipEvent);
	}

	public void memberRemoved(MembershipEvent membershipEvent) {
		System.out.println(membershipEvent);
	}

}
