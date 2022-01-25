class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null){return null;}
        
        if(key<root.val){
            root.left =deleteNode(root.left,key);
        }else if(key> root.val){
           root.right =  deleteNode(root.right,key);
        }
        else {
            if(root.left ==null){
            TreeNode right = root.right;
            root=null;
            return right;
        }if(root.right == null){
                TreeNode left = root.left;
            root=null;
            return left;
            }
            root.val = succesor(root.right);
            root.right =  deleteNode(root.right,root.val);
        }
        return root;
    }
    public int succesor(TreeNode t){
        if(t.left == null){
            return t.val;
        }
        return succesor(t.left);
    }
}
