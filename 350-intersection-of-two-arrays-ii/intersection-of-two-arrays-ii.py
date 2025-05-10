class Solution(object):
    def intersect(self, nums1, nums2):
        nums1.sort()
        nums2.sort()
        n1=len(nums1)
        n2=len(nums2)
        res=[]

        i=0
        j=0
        while(i<n1 and j<n2):
            if(nums1[i]==nums2[j]):
                res.append(nums1[i])
                i+=1
                j+=1
            elif(nums1[i]<nums2[j]):
                i+=1
            else:
                j+=1

        return res

        